package com.library.dao;

import com.library.models.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public class ReadersDaoImpl implements ReadersDao {

    private static final String SQL_SELECT_ALL_READERS = "SELECT * FROM readers";

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReadersDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Reader> getReaderListFromDB() {
        return this.jdbcTemplate.query(
                SQL_SELECT_ALL_READERS,
                (resultSet, i) -> new Reader(resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("third_name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone_number"),
                        resultSet.getDate("bith_date").toLocalDate(),
                        resultSet.getDate("register_date").toLocalDate())
        );
    }

    @Override
    public Reader getReaderByIdFromDB(Integer id) {
        return null;
    }

    @Override
    public Reader getReaderByFirstNameFromDB(String firstName) {
        return null;
    }

    @Override
    public Reader getReaderBySecondNameFromDB(String secondName) {
        return null;
    }

    @Override
    public Reader getReaderByPhoneNumberFromDB(String phoneNumber) {
        return null;
    }

    @Override
    public Reader getReaderByEmailFromDB(String eMail) {
        return null;
    }

    @Override
    public void deleteReaderFromDB(Integer id) {

    }

    @Override
    public void insertReaderIntoDB(Reader reader) {

    }

    @Override
    public void updateReader(Reader reader) {

    }
}
