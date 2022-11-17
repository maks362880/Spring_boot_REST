package com.maks362880.spring_boot_rest.dao;

import com.maks362880.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getALLEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
