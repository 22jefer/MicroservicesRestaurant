/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Reservation_service.Controller;

import com.Js.Reservation_service.Entity.Reservation;
import com.Js.Reservation_service.Response.Response;
import com.Js.Reservation_service.Service.Reservation_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("/api/reservation")
@AllArgsConstructor
@Data
public class Reservation_controller {
    
    private final Reservation_service reservation_service;
    
    @PostMapping
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return reservation_service.saveReservation(reservation);
    }
    
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Integer id){
        return reservation_service.getReservationById(id);
    }
    
    @GetMapping
    public List<Reservation> listReservation(){
        return reservation_service.listReservation();
    }
    
    @GetMapping("/response/{id}")
    public Response response(@PathVariable Integer id){
        return reservation_service.response(id);
    }
    
    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return reservation_service.updateReservation(reservation);
    }
    
    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable Integer id){
        reservation_service.deleteReservation(id);
    }
    
}
