package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.AddressResponse;
import com.myproject.SpringFirstApplication.Entity.Address;
import com.myproject.SpringFirstApplication.Repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    final AddressRepository addressRepository;
    final ModelMapper mapper;

    public AddressService(AddressRepository addressRepository, ModelMapper mapper) {
        this.addressRepository = addressRepository;
        this.mapper = mapper;
    }

    public AddressResponse Get(int id){
        Address singleAddress = addressRepository.findById(id).orElse(null);
        return mapper.map(singleAddress,AddressResponse.class);
    }

}
