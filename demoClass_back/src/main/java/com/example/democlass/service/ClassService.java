package com.example.democlass.service;

import com.example.democlass.modal.ClassDTO;
import com.example.democlass.modal.ClassDao;
import com.example.democlass.modal.StudentDTO;
import com.example.democlass.modal.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassDao classDao;

    public List<ClassDTO> findAll() {
        return classDao.findAll();
    }
}
