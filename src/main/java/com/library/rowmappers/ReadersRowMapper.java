package com.library.rowmappers;

import com.library.models.Reader;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadersRowMapper implements RowMapper<Reader> {
    @Override
    public Reader mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Reader(resultSet.getInt("reader_id"),
                resultSet.getString("name"),
                resultSet.getString("second_name"),
                resultSet.getString("patronymic"),
                resultSet.getDate("birth_date"),
                resultSet.getDate("registration_date"),
                resultSet.getInt("debt"),
                resultSet.getString("status_short"),
                resultSet.getString("email"),
                resultSet.getString("phone_number"));
    }
}
