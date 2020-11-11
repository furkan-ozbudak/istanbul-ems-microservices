package com.furkanozbudak.departmentservice.service;

import com.furkanozbudak.departmentservice.entity.Department;
import com.furkanozbudak.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findById(Long departmentId) {
        log.info("Inside find by id method of departmend service");
        return departmentRepository.findById(departmentId).orElse(null);
    }

    public Department saveDepartment( Department department) {
        log.info("Inside the save department method of Department Service.");
        return departmentRepository.save(department);
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }





}
