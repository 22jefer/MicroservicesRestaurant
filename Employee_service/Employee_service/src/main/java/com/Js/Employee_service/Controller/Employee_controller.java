package com.Js.Employee_service.Controller;


import com.Js.Employee_service.Entity.Employee;
import com.Js.Employee_service.Service.Employee_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
@Data
public class Employee_controller {
    
    private final Employee_service employee_service;
    
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employee_service.saveEmployee(employee);
    }
    
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employee_service.getEmployeeById(id);
    }
    
    @GetMapping
    public List<Employee> listEmployee(){
        return employee_service.ListEmployee();
    }
    
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employee_service.updateEmployee(employee);
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable Integer id){
        employee_service.deleteEmployee(id);
    }
    
}
