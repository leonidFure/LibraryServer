package com.library.dao;

import com.library.models.Reader;
import com.library.rowmappers.ReadersRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Repository
public class ReadersDaoImpl implements ReadersDao {

    private RowMapper<Reader> rowMapper = new ReadersRowMapper();

    private static final String SQL_SELECT_ALL_READERS = "SELECT * FROM reader";
    private static final String SQL_SELECT_READER_BY_ID = "SELECT * FROM reader WHERE reader.reader_id = ?";
    private static final String SQL_SELECT_READERS_BY_FIRST_NAME = "SELECT * FROM reader WHERE reader.first_name = ?";
    private static final String SQL_SELECT_READERS_BY_SECOND_NAME = "SELECT * FROM reader WHERE reader.second_name = ?";
    private static final String SQL_SELECT_READERS_BY_PHONE_NUMBER = "SELECT * FROM reader WHERE readers.phone_number = ?";
    private static final String SQL_SELECT_READERS_BY_EMAIL = "SELECT * FROM readers WHERE readers.email = ?";
    private static final String SQL_INSERT_READER = "INSERT INTO reader (name, second_name, patronymic, " +
                                                    "birth_date, registration_date, debt, status_short," +
                                                    "email, phone_number) " +
                                                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_READER = "DELETE FROM reader WHERE reader.reader_id = ?";
    private static final String SQL_UPDATE_READER = "UPDATE reader SET name = ?, " +
                                                    "second_name = ?, patronymic = ?," +
                                                    "bith_date = ?," +
                                                    "registration_date = ?," +
                                                    "debt = ?," +
                                                    "status_short = ?," +
                                                    "email = ?," +
                                                    "phone_number = ? WHERE id = ?";

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReadersDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Reader> getReaderListFromDB() {
        return jdbcTemplate.query(SQL_SELECT_ALL_READERS, rowMapper);
    }

    @Override
    public Reader getReaderByIdFromDB(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_READER_BY_ID, rowMapper, id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Reader> getReadersByFirstNameFromDB(String firstName) {
        return jdbcTemplate.query(SQL_SELECT_READERS_BY_FIRST_NAME, rowMapper, firstName);
    }

    @Override
    public List<Reader> getReadersBySecondNameFromDB(String secondName) {
        return jdbcTemplate.query(SQL_SELECT_READERS_BY_SECOND_NAME, rowMapper, secondName);
    }

    @Override
    public List<Reader> getReadersByPhoneNumberFromDB(String phoneNumber) {
        return jdbcTemplate.query(SQL_SELECT_READERS_BY_PHONE_NUMBER, rowMapper, phoneNumber);
    }

    @Override
    public List<Reader> getReadersByEmailFromDB(String eMail) {
        return jdbcTemplate.query(SQL_SELECT_READERS_BY_EMAIL, rowMapper, eMail);
    }

    @Override
    public void deleteReaderFromDB(Integer id) {
        jdbcTemplate.update(SQL_DELETE_READER, id);
    }

    @Override
    public void insertReaderIntoDB(Reader reader) {
        jdbcTemplate.update(SQL_INSERT_READER,reader.getFirstName(),
                reader.getSecondName(), reader.getPatronymic(),
                reader.getBirthDate(), reader.getRegistrationDate(),
                reader.getDebt(), reader.getStatusShort(),
                reader.geteMail(), reader.getPhoneNumber());
    }

    @Override
    public void updateReader(Reader reader) {
        jdbcTemplate.update(SQL_UPDATE_READER,reader.getFirstName(),
                reader.getSecondName(), reader.getPatronymic(),
                reader.getBirthDate(), reader.getRegistrationDate(),
                reader.getDebt(), reader.getStatusShort(),
                reader.geteMail(), reader.getPhoneNumber(),
                reader.getId());
    }
}
