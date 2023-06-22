package com.example1.repository;

import com.example1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
         public Department findByDepartmentId(Long departmentId);
         public Department findByDepartmentName(String departmentName);


}
