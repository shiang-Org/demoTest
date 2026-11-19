package com.example.democlass.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


@Repository
public class StudentDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<StudentDTO> findAll() {

        String sql = "SELECT s.id, s.number, s.name, s.class_id, c.grade, c.class_name " +
                "FROM student AS s " +
                "LEFT JOIN class AS c ON s.class_id = c.id " +
                "WHERE s.delete_date IS NULL";

        // 透過 BeanPropertyRowMapper 自動將 SQL 結果對應到 StudentDTO 物件
        List<StudentDTO> list = namedParameterJdbcTemplate.query(
                sql,
                new HashMap<>(),
                new BeanPropertyRowMapper<>(StudentDTO.class)
        );

        return list;
    }
}
