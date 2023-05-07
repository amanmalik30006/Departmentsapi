package com.example1.service;

import com.example1.entity.Department;
import com.example1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceimpl  implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department savedepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getdepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }


}
