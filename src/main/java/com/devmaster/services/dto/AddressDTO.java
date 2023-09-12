package com.devmaster.services.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
    private int id;
    private String name;
    private String city;
    private String district;
}
