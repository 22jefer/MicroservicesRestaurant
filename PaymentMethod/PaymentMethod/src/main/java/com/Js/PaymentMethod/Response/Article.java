/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.PaymentMethod.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Article {
    
    private int code_article;

    private String description;

    private double purchasePrice;
}
