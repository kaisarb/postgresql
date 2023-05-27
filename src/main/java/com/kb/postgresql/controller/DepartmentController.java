package com.kb.postgresql.controller;

import com.kb.postgresql.entity.Department;
import com.kb.postgresql.service.DepartmentService;
import com.kb.postgresql.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
       // DepartmentService service = new DepartmentServiceImpl();
        return departmentService.saveDepartment(department);
    }
}
