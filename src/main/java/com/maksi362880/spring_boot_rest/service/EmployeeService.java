package com.maksi362880.spring_boot_rest.service;

import com.maksi362880.spring_boot_rest.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);


}
