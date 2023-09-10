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
public class Reservation {
    
    private int code_reservation;

    private int num_table;

    private String date_reservation;

    private String time_reservation;

    private int amount_people;

    private int code_employee;
}
