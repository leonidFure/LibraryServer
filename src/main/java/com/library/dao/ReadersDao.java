package com.library.dao;

import com.library.models.Reader;

import java.util.List;

public interface ReadersDao {
    List<Reader> getReaderListFromDB();
    Reader getReaderByIdFromDB(Integer id);
    List<Reader> getReadersByFirstNameFromDB(String firstName);
    List<Reader> getReadersBySecondNameFromDB(String secondName);
    List<Reader> getReadersByPhoneNumberFromDB(String phoneNumber);
    List<Reader> getReadersByEmailFromDB(String eMail);
    void deleteReaderFromDB(Integer id);
    void insertReaderIntoDB(Reader reader);
    void updateReader(Reader reader);
}
