/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Table_service.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@jakarta.persistence.Table(name = "TableS")
public class Table {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num_table;
    
    @Column(nullable = false)
    private int num_chair;
}
