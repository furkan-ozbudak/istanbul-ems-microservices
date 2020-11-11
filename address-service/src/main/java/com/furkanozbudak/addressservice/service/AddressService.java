package com.furkanozbudak.addressservice.service;

import com.furkanozbudak.addressservice.entity.Address;
import com.furkanozbudak.addressservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
