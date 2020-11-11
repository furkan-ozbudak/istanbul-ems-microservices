package com.furkanozbudak.userservice.controller;

import com.furkanozbudak.userservice.VO.ResponseTemplateVO;
import com.furkanozbudak.userservice.entity.Employee;
import com.furkanozbudak.userservice.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees/")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/")
    public Employee save(@RequestBody Employee employee) {
        log.info("Inside save method of Employee Controller.");
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }

    @GetMapping("/findFullEmployeeInfo/{id}")
    public ResponseTemplateVO findFullEmployeeInfo(@PathVariable("id") Long userId) {
        log.info("Inside findById of Employee Controller");
        return employeeService.findFullEmployeeInfo(userId);
    }
}
