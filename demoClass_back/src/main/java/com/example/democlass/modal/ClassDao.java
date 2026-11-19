package com.example.democlass.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ClassDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<ClassDTO> findAll() {

        String sql = "SELECT id, grade, class_name " +
                "FROM class " +
                "WHERE delete_date IS NULL";

        // 透過 BeanPropertyRowMapper 自動將 SQL 結果對應到 StudentDTO 物件
        List<ClassDTO> list = namedParameterJdbcTemplate.query(
                sql,
                new HashMap<>(),
                new BeanPropertyRowMapper<>(ClassDTO.class)
        );

        return list;
    }
}
