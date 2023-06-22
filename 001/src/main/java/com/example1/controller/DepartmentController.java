package com.example1.controller;

import com.example1.entity.Department;
import com.example1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.savedepartment(department);



    }
    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return departmentService.getdepartments();
    }
@GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId)
    {
        return departmentService.getDepartmentById(departmentId);

    }
    @GetMapping("/departments/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }

    @DeleteMapping("/departments/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId,department);
    }



}
