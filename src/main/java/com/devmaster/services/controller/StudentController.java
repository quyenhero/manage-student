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
    void save(@RequestBody List<StudentDTO> studentDTO){
        studentService.save(studentDTO);
    }
    @GetMapping("/findByName")
    List<StudentDTO> findByName(@RequestParam("name")String name){
        return studentService.findByName(name);
    }
    @GetMapping("/findByAddress")
    List<StudentDTO> findByAddress(@RequestParam("city")String city){
        return studentService.findByAddress(city);
    }
    @GetMapping("/findByClass")
    List<StudentDTO> findByClass(@RequestParam("class")String cls){
        return studentService.findByClass(cls);
    }
    @GetMapping("/findBySubject")
    List<StudentDTO> findBySubject(@RequestParam("subject")String subject){
        return studentService.findBySubject(subject);
    }
    @GetMapping("/filterPoint")
    List<StudentDTO> filterPoint(){
        return studentService.filterPoint();
    }
}
