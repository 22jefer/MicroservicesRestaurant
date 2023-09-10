/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.PaymentMethod.Entity;

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
@Data
@NoArgsConstructor
@Table(name = "PaymentMethod")
public class PaymentMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_paymentMethod;
    
    @Column(nullable = false)
    private String num_account;
    
    @Column(nullable = false)
    private String code_card;
    
    @Column(nullable = false)
    private String num_card;
    
    @Column(nullable = false)
    private String due_date;
    
    @Column(nullable = false)
    private int code_article;
}
