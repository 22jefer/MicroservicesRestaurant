/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Reservation_service.Response;

import com.Js.Reservation_service.Entity.Reservation;
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
    
    private Employee employee;
    private Table table;
    private Reservation reservation;
    
    
}
