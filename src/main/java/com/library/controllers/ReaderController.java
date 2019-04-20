package com.library.controllers;

import com.library.dao.ReadersDao;
import com.library.models.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ReaderController {

    @Autowired
    private ReadersDao readersDao;

    @RequestMapping(value = "/readers", method = RequestMethod.GET, produces = "application/json")
    public List<Reader> getReaderList(){
        return readersDao.getReaderListFromDB();
    }
}
