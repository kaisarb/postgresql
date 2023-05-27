package com.kb.postgresql.service;

import com.kb.postgresql.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
