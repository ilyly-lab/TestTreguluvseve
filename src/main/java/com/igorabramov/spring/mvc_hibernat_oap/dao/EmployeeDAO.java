package com.igorabramov.spring.mvc_hibernat_oap.dao;

import com.igorabramov.spring.mvc_hibernat_oap.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
