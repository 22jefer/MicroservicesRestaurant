/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.CustomerSuper_service.Controller;

import com.Js.CustomerSuper_service.Entity.CustomerSuper;
import com.Js.CustomerSuper_service.Response.Response;
import com.Js.CustomerSuper_service.Service.CustomerSuper_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("/api/customerSuper")
@AllArgsConstructor
@Data
public class CustomerSuper_controller {
    
    public CustomerSuper_service customerSuper_service;
    
    @PostMapping
    public CustomerSuper saveCustomerSuper(@RequestBody CustomerSuper customerSuper){
        return customerSuper_service.saveCustomerSuper(customerSuper);
    }
    
    @GetMapping("/{id}")
    public CustomerSuper getCustomerSuperById(@PathVariable Integer id){
        return customerSuper_service.getCustomerSuperById(id);
    }
    
    @GetMapping
    public List<CustomerSuper> findAllCustomerSuper(){
        return customerSuper_service.findAllCustomerSuper();
    }
    
    @GetMapping("/response/{id}")
    public Response response(@PathVariable Integer id){
        return customerSuper_service.response(id);
    }
    
    @PutMapping
    public CustomerSuper updateCustomerSuper(@RequestBody CustomerSuper customerSuper){
        return customerSuper_service.updateCustomerSuper(customerSuper);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCustomerSuperById(@PathVariable Integer id){
        customerSuper_service.deleteCustomerSuperById(id);
    }
    
}
