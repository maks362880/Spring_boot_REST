package com.maks362880.spring_boot_rest.controller;

import com.maks362880.spring_boot_rest.entity.Employee;
import com.maks362880.spring_boot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployee();
        return allEmployees;
    }


    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
//        if (employee == null) {
//            throw new NoSuchEmployeeExeption("There are no employee with id = " + id +" in Database");
//        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
//        if (employee == null) {
//            throw new NoSuchEmployeeExeption("There are no employee with id = " + id +" in Database");
//        }
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }
}
