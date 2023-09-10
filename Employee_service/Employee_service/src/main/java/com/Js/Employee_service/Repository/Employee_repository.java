/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Js.Employee_service.Repository;

import com.Js.Employee_service.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */
public interface Employee_repository extends JpaRepository<Employee, Integer>{

    
}
