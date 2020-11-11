package com.furkanozbudak.departmentservice.controller;

import com.furkanozbudak.departmentservice.entity.Department;
import com.furkanozbudak.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId) {
        log.info("Inside find by id method of DepartmentController");
        return departmentService.findById(departmentId);
    }

    @PostMapping("/")
    public Department save(@RequestBody Department department) {
        log.info("Inside the save method of Department Controller.");
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        departmentService.deleteById(id);
    }






}
