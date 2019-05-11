package com.library.controllers;

import com.library.dao.ReadersDao;
import com.library.models.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReaderController {

    @Autowired
    private ReadersDao readersDao;

    @RequestMapping(value = "/readers", method = RequestMethod.GET, produces = "application/json")
    public List<Reader> getReaderList(){
        return readersDao.getReaderListFromDB();
    }

    @RequestMapping(value = "/readers", method = RequestMethod.PUT, produces = "application/json")
    public void addNewReader(@RequestBody Reader reader){
        readersDao.insertReaderIntoDB(reader);
    }

    @RequestMapping(value = "readers", method = RequestMethod.POST, produces = "application/json")
    public void updateReader(@RequestBody Reader reader){
        readersDao.updateReader(reader);
    }

    @RequestMapping(value = "/readers/{reader_id}", method = RequestMethod.GET, produces = "application/json")
    public Reader getReaderList(@PathVariable String reader_id){
        return readersDao.getReaderByIdFromDB(Integer.valueOf(reader_id));
    }

    @RequestMapping(value = "/readers/{reader_id}", method = RequestMethod.DELETE, produces = "application/json")
    public void removeReader(@PathVariable String reader_id){
        readersDao.deleteReaderFromDB(Integer.valueOf(reader_id));
    }
}
