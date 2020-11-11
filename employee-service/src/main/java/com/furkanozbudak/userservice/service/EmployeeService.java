package com.furkanozbudak.userservice.service;

import com.furkanozbudak.userservice.VO.Address;
import com.furkanozbudak.userservice.VO.Department;
import com.furkanozbudak.userservice.VO.ResponseTemplateVO;
import com.furkanozbudak.userservice.entity.Employee;
import com.furkanozbudak.userservice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee save(Employee employee) {
        log.info("Inside save of Employee Service");
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    public ResponseTemplateVO findFullEmployeeInfo(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = employeeRepository.findById(userId).orElse(null);

        Department department = restTemplate.getForObject("http://API-GATEWAY/departments/" + employee.getDepartmentId(), Department.class);
        Address address = restTemplate.getForObject("http://API-GATEWAY/addresses/" + employee.getAddressId(), Address.class);
        vo.setEmployee(employee);
        vo.setDepartment(department);
        vo.setAddress(address);

        return vo;
    }
}
