package com.igorabramov.spring.mvc_hibernat_oap.service;

import com.igorabramov.spring.mvc_hibernat_oap.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
