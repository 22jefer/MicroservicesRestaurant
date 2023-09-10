/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.CustomerSuper_service.Response;

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
public class PaymentMethod {
    
    private int code_paymentMethod;

    private String num_account;

    private String code_card;
   
    private String num_card;

    private String due_date;

    private int code_article;
}
