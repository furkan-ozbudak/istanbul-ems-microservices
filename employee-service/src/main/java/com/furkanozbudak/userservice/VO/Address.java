package com.furkanozbudak.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String zipcode;
    private String city;
    private String state;
    private String employeeId;
}
