package com.example1.service;

import com.example1.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department savedepartment(Department department);

   public List<Department> getdepartments();


   public Department getDepartmentById(Long departmentId);

  public Department getDepartmentByName(String departmentName);



  public   void deleteDepartmentById(Long departmentId);

  public  Department updateDepartmentById(Long departmentId, Department department);
}
