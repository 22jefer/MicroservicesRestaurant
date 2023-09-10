/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.CustomerSuper_service.Response;

import com.Js.CustomerSuper_service.Entity.CustomerSuper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
    
    private Table table;
    
    private Employee employee;
    
    private Reservation reservation;
    
    private Article article;
    
    private PaymentMethod paymentMethod;
    
    private CustomerSuper customerSuper;
    
}
