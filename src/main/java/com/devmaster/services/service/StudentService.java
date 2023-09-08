package com.devmaster.services.service;

import com.devmaster.services.domain.Student;
import com.devmaster.services.dto.StudentDTO;
import com.devmaster.services.mapper.StudentMapper;
import com.devmaster.services.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;
    public List<StudentDTO> getAll(){
        List<StudentDTO> students = studentMapper.toDTO(studentRepository.findAll());
        return students;
    }
    public List<StudentDTO> findByName(String name){
        List<StudentDTO> students = studentMapper.toDTO(studentRepository.findByName(name));
        return students;
    }
    public void save(StudentDTO studentDTO){
        Student student=studentMapper.toEntity((studentDTO));
        studentRepository.save(student);
    }
    public void saveListStudent(List<StudentDTO> studentDTO){
//        studentDTO.forEach(studentDTO1 -> {
            List<Student> students =studentMapper.toEntity((studentDTO));
            studentRepository.saveAll(students);
//        });
    }
}
