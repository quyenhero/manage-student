package com.devmaster.services.mapper;

import com.devmaster.services.domain.Subject;
import com.devmaster.services.dto.SubjectDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubjectMapper implements EntityMapper<Subject, SubjectDTO>{
    @Override
    public Subject toEntity(SubjectDTO dto) {

        return null;
    }

    @Override
    public List<Subject> toEntity(List<SubjectDTO> dto) {
        return null;
    }

    @Override
    public SubjectDTO toDTO(Subject entity) {
        return SubjectDTO.builder().id(entity.getId()).name(entity.getName()).build();
    }

    @Override
    public List<SubjectDTO> toDTO(List<Subject> entities) {
        List<SubjectDTO> dtos = new ArrayList<>();
        entities.forEach(subject -> {
            SubjectDTO dto = toDTO(subject);
            dtos.add(dto);
        });
        return dtos;
    }
}
