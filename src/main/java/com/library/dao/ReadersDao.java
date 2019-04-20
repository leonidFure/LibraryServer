package com.library.dao;

import com.library.models.Reader;

import java.util.List;

public interface ReadersDao {
    List<Reader> getReaderListFromDB();
    Reader getReaderByIdFromDB(Integer id);
    Reader getReaderByFirstNameFromDB(String firstName);
    Reader getReaderBySecondNameFromDB(String secondName);
    Reader getReaderByPhoneNumberFromDB(String phoneNumber);
    Reader getReaderByEmailFromDB(String eMail);
    void deleteReaderFromDB(Integer id);
    void insertReaderIntoDB(Reader reader);
    void updateReader(Reader reader);
}
