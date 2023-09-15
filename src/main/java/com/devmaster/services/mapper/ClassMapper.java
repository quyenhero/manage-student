package com.devmaster.services.mapper;

import com.devmaster.services.domain.Subject;
import com.devmaster.services.dto.ClassDTO;
import com.devmaster.services.dto.SubjectDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassMapper implements EntityMapper<Class, ClassDTO>{
    @Override
    public Class toEntity(ClassDTO dto) {

        return null;
    }

    @Override
    public List<Class> toEntity(List<ClassDTO> dto) {
        return null;
    }

    @Override
    public ClassDTO toDTO(Class entity) {
        return ClassDTO.builder().name(entity.getName()).build();
    }

    @Override
    public List<ClassDTO> toDTO(List<Class> entities) {
        List<ClassDTO> dtos = new ArrayList<>();
        entities.forEach(cl -> {
            ClassDTO dto = toDTO(cl);
            dtos.add(dto);
        });
        return dtos;
    }
}
