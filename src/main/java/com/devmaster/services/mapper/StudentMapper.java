package com.devmaster.services.mapper;

import com.devmaster.services.domain.Student;
import com.devmaster.services.dto.StudentDTO;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    @Autowired
    private AddressMapper addressMapper;
    public StudentDTO toDTO(Student entity){
        StudentDTO dto = StudentDTO.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .fullName(entity.getLastName()+" "+entity.getFirstName())
                .addressDTO(addressMapper.toDTO(entity.getAddress()))
                .build();
        return dto;
    }
    public List<StudentDTO> toDTO(List<Student> entities){
        List<StudentDTO> dtos = new ArrayList<>();
        entities.forEach(student -> {
            StudentDTO dto = toDTO(student);
            dtos.add(dto);
        });
        return dtos;
    }
    public Student toEntity(StudentDTO studentDTO){
        Student entity = Student.builder().id(studentDTO.getId()).firstName(studentDTO.getFirstName()).lastName(studentDTO.getLastName()).build();
        return entity;
    }
    public List<Student> toEntity(List<StudentDTO> dtos){
        List<Student> entities = new ArrayList<>();
        dtos.forEach(student -> {
            Student entity = toEntity(student);
            entities.add(entity);
        });
        return entities;
    }
}
