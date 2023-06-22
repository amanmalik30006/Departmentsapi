package com.example1.service;

import com.example1.entity.Department;
import com.example1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteDepartmentById(Long departmentId) {
         departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department depUB=departmentRepository.findByDepartmentId(departmentId);
        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName()))
        {
            depUB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode()))
        {
            depUB.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress()))
        {
            depUB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depUB);
    }


}
