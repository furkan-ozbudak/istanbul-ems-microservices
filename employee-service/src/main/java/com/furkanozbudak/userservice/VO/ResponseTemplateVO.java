package com.furkanozbudak.userservice.VO;

import com.furkanozbudak.userservice.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Employee employee;
    private Department department;
    private Address address;

}
