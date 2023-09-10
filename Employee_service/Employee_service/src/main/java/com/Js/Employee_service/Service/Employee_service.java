/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Employee_service.Service;

import com.Js.Employee_service.Entity.Employee;
import com.Js.Employee_service.Repository.Employee_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
@AllArgsConstructor
@Data
public class Employee_service {
    
    private final Employee_repository employee_repository;
    
    public Employee saveEmployee(Employee employee){
        return employee_repository.save(employee);
    }
    
    public Employee getEmployeeById(Integer Id){
        return employee_repository.findById(Id).get();
    }
    
    public List<Employee> ListEmployee(){
        return employee_repository.findAll();
    }
    
    public Employee updateEmployee(Employee employee){
        return employee_repository.save(employee);
    }
    
    public void deleteEmployee(Integer id){
        employee_repository.deleteById(id);
    }
}
