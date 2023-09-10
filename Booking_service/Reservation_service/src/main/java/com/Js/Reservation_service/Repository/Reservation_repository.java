/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Js.Reservation_service.Repository;

import com.Js.Reservation_service.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */
public interface Reservation_repository extends JpaRepository<Reservation, Integer>{
    
}
