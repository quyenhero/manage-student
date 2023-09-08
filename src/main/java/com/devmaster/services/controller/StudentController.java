package com.devmaster.services.controller;

import com.devmaster.services.domain.Student;
import com.devmaster.services.dto.StudentDTO;
import com.devmaster.services.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    List<StudentDTO> getAll(){
        return studentService.getAll();
    }
    @PostMapping("/student")
    void save(@RequestBody StudentDTO studentDTO){
        studentService.save(studentDTO);
    }
    @PostMapping("/students")
    void saveListStudent(@RequestBody List<StudentDTO> studentDTO){
        studentService.saveListStudent(studentDTO);
    }
    @GetMapping("/findByName")
    List<StudentDTO> findByName(@RequestParam String name){
        return studentService.findByName(name);
    }
}
