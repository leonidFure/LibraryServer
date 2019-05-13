package com.library.controllers;

import com.library.dao.ReadersDao;
import com.library.exceptions.ReaderNotFoundError;
import com.library.models.Reader;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/readers")
@RestController
@Api(value="Readers library", description="Operations with readers")
public class ReaderController {
    private static final Logger logger = LoggerFactory.getLogger(ReaderController.class);
    private final ReadersDao readersDao;

    @Autowired
    public ReaderController(ReadersDao readersDao) {
        this.readersDao = readersDao;
    }

    @ApiOperation(value = "View a list of readers",response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "Readers not found")
        }
    )
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getReaderList(){
        List<Reader> readerList = readersDao.getReaderListFromDB();
        if(readerList.isEmpty())
            return new ResponseEntity<>(new ReaderNotFoundError("Readers not found"),
                    HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<>(readerList,HttpStatus.OK);
    }

    @ApiOperation(value = "Add a new Reader")
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<?> addNewReader(@RequestBody Reader reader){
        logger.info("Adding Reader {}", reader);
        readersDao.insertReaderIntoDB(reader);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ApiOperation(value = "Update a Reader with an ID")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> updateReader(@RequestBody Reader reader){
        logger.info("Updating Reader with id {}", reader.getId());
        Reader findReader = readersDao.getReaderByIdFromDB(reader.getId());
        if(findReader == null){
            logger.error("Unable to update. Reader with id {} not found.", reader.getId());
            return new ResponseEntity<>(new ReaderNotFoundError("Unable to update. Reader with id " + reader.getId() + " not found"), HttpStatus.NOT_FOUND);
        }
        readersDao.updateReader(reader);
        return new ResponseEntity<>(reader, HttpStatus.OK);
    }

    @ApiOperation(value = "Search a Reader with an ID",response = Reader.class)
    @RequestMapping(value = "/{reader_id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getReader(@PathVariable String reader_id){
        logger.info("Fetching Reader with id {}", reader_id);
        Reader reader = readersDao.getReaderByIdFromDB(Integer.valueOf(reader_id));
        if(reader == null){
            logger.error("Reader with id {} not found.", reader_id);
            return new ResponseEntity<>(new ReaderNotFoundError("Reader with id " + reader_id + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(reader,HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a Reader with an ID")
    @RequestMapping(value = "/{reader_id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<?> removeReader(@PathVariable String reader_id){
        logger.info("Delete Reader with id {}", reader_id);
        Reader reader = readersDao.getReaderByIdFromDB(Integer.valueOf(reader_id));
        if(reader == null){
            logger.error("Unable to delete. Reader with id {} not found.", reader_id);
            return new ResponseEntity<>(new ReaderNotFoundError("Reader with id " + reader_id + " not found"), HttpStatus.NOT_FOUND);
        }
        readersDao.deleteReaderFromDB(Integer.valueOf(reader_id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
