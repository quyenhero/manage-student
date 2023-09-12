package com.devmaster.services.service;

import com.devmaster.services.dto.AddressDTO;
import com.devmaster.services.mapper.AddressMapper;
import com.devmaster.services.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressMapper addressMapper;
    public List<AddressDTO> getAll(){return addressMapper.toDTO(addressRepository.findAll());}
    public AddressDTO getById(Integer id){return addressMapper.toDTO(addressRepository.getById(id));}
}
