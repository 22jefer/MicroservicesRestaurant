/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.CustomerSuper_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "CustomerSuper")
public class CustomerSuper {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_customer;
    
    @Column(nullable = false)
    private String key_customer;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String phone;
    
    @Column(nullable = false)
    private String birthDate;
    
    @Column(nullable = false)
    private int num_table;
    
    @Column(nullable = false)
    private int code_employee;
    
    @Column(nullable = false)
    private int code_reservation;
    
    @Column(nullable = false)
    private int code_article;
    
    @Column(nullable = false)
    private int code_paymentMethod;
    
}
