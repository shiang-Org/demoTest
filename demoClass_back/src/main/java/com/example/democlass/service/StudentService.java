package com.example.democlass.service;

import com.example.democlass.modal.StudentDTO;
import com.example.democlass.modal.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<StudentDTO> findAll() {
        return studentDao.findAll();
    }
}
