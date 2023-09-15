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
    public List<StudentDTO> findByAddress(String city){
        List<StudentDTO> students = studentMapper.toDTO(studentRepository.findByAddress(city));
        return students;
    }
    public List<StudentDTO> findByClass(String cls){
//        cls là class
        List<StudentDTO> students = studentMapper.toDTO(studentRepository.findByClass(cls));
        return students;
    }
    public List<StudentDTO> findBySubject(String subject){
        List<StudentDTO> students = studentMapper.toDTO(studentRepository.findBySubject(subject));
        return students;
    }
    public List<StudentDTO> filterPoint(){
        return studentMapper.toDTO(studentRepository.filterPoint());
    }
    public void save(StudentDTO studentDTO){
        Student student=studentMapper.toEntity((studentDTO));
        studentRepository.save(student);
    }
    public void save(List<StudentDTO> studentDTO){
            List<Student> students =studentMapper.toEntity((studentDTO));
            studentRepository.saveAll(students);
    }
}
