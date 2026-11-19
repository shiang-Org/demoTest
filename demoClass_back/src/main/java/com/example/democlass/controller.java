package com.example.democlass;

import com.example.democlass.modal.ClassDTO;
import com.example.democlass.modal.StudentDTO;
import com.example.democlass.service.ClassService;
import com.example.democlass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controller {
    @Autowired
    private ClassService classService;
    @Autowired
    private StudentService studentService;

    //查詢所有班級
    @GetMapping("/classes")
    public ResponseEntity<List<ClassDTO>> getAllClass(){
        List<ClassDTO> classes = classService.findAll();
        return ResponseEntity.ok(classes);
    }

    //查詢所有學生
    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getAllStudent(){
        List<StudentDTO> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

}
