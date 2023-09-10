/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.PaymentMethod.Controller;

import com.Js.PaymentMethod.Entity.PaymentMethod;
import com.Js.PaymentMethod.Response.Response;
import com.Js.PaymentMethod.Service.PaymentMethod_service;
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
@RequestMapping("/api/paymentMethod")
@AllArgsConstructor
@Data
public class PaymentMethod_controller {
    
    private final PaymentMethod_service paymentMethod_service;
    
    @PostMapping
    public PaymentMethod savePaymentMethod(@RequestBody PaymentMethod paymentMethod){
        return paymentMethod_service.savePaymentMethod(paymentMethod);
    }
    
    @GetMapping("/{id}")
    public PaymentMethod getPaymentMethodById(@PathVariable Integer id){
        return paymentMethod_service.getPaymentMethodById(id);
    }
    
    @GetMapping
    public List<PaymentMethod> findAllPaymentMethod(){
        return paymentMethod_service.findAllPaymentMethod();
    }
    
    @GetMapping("/response/{id}")
    public Response response(@PathVariable Integer id){
        return paymentMethod_service.response(id);
    }
    
    @PutMapping
    public PaymentMethod updatePaymentMethod(@RequestBody PaymentMethod paymentMethod){
        return paymentMethod_service.updatePaymentMethod(paymentMethod);
    }
    
    @DeleteMapping("/{id}")
    public void deletePaymentMethodById(@PathVariable Integer id){
        paymentMethod_service.deletePaymentMethodById(id);
    }
    
}
