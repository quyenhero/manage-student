package com.devmaster.services.controller;

import com.devmaster.services.dto.AddressDTO;
import com.devmaster.services.mapper.AddressMapper;
import com.devmaster.services.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping(value = "/address")
    List<AddressDTO> getAll(){return addressService.getAll();}
    @GetMapping(value = "/address/{id}")
    AddressDTO getById(@PathVariable("id") Integer id){return addressService.getById(id);}
}
