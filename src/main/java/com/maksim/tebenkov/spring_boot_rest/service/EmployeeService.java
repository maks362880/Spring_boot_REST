package com.maksim.tebenkov.spring_boot_rest.service;

import com.maksim.tebenkov.spring_boot_rest.dao.EmployeeDAO;
import com.maksim.tebenkov.spring_boot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);


}
