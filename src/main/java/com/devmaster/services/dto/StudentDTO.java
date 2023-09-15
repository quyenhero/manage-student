package com.devmaster.services.dto;

import com.devmaster.services.domain.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private AddressDTO addressDTO;
    private List<Subject> subjectsDTOs;
    private ClassDTO  classDTO;
}
