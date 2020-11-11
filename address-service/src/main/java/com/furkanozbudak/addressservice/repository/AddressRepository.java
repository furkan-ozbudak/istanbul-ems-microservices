package com.furkanozbudak.addressservice.repository;

import com.furkanozbudak.addressservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
