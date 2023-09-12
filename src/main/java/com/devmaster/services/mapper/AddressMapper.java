package com.devmaster.services.mapper;

import com.devmaster.services.domain.Address;
import com.devmaster.services.dto.AddressDTO;
import com.devmaster.services.dto.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AddressMapper implements EntityMapper<Address,AddressDTO>{
    @Override
    public Address toEntity(AddressDTO dto) {
        return Address.builder().id(dto.getId()).city(dto.getCity()).name(dto.getName()).district(dto.getDistrict()).build();
    }

    @Override
    public List<Address> toEntity(List<AddressDTO> dto) {
        return null;
    }

    @Override
    public AddressDTO toDTO(Address entity) {
        return AddressDTO.builder().id(entity.getId()).city(entity.getCity()).name(entity.getName()).district(entity.getDistrict()).build();
    }

    @Override
    public List<AddressDTO> toDTO(List<Address> entities) {
        List<AddressDTO> dtos = new ArrayList<>();
        entities.forEach( entity-> {
            AddressDTO dto = toDTO(entity);
            dtos.add(dto);
        });
        return dtos;
    }
}
