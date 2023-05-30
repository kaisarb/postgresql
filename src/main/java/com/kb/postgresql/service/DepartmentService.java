package com.kb.postgresql.service;

import com.kb.postgresql.entity.Department;
import com.kb.postgresql.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

    public Department fetchDepartmentByNameIgnoreCase(String departmentName);
}
