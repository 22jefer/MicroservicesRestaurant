/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Js.PaymentMethod.Repository;

import com.Js.PaymentMethod.Entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */
public interface PaymentMethod_repository  extends JpaRepository<PaymentMethod, Integer>{
    
}
