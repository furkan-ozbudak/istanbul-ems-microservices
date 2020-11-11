package com.furkanozbudak.addressservice.controller;

import com.furkanozbudak.addressservice.entity.Address;
import com.furkanozbudak.addressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/")
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public Address findById(@PathVariable("id") Long id) {
        return addressService.findById(id);
    }

    @PostMapping("/")
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        addressService.deleteById(id);
    }

}
