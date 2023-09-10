/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Reservation_service.Service;

import com.Js.Reservation_service.Entity.Reservation;
import com.Js.Reservation_service.Repository.Reservation_repository;
import com.Js.Reservation_service.Response.Employee;
import com.Js.Reservation_service.Response.Response;
import com.Js.Reservation_service.Response.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */

@Service
@AllArgsConstructor
@Data
public class Reservation_service {
    
    private final Reservation_repository reservation_repository;
    
    private final RestTemplate restTemplate;
    
    public Reservation saveReservation(Reservation reservation){
        return reservation_repository.save(reservation);
    }
    
    public Reservation getReservationById(Integer id){
        return reservation_repository.findById(id).get();
    }
    
    public List<Reservation> listReservation(){
        return reservation_repository.findAll();
    }
    
    public Reservation updateReservation(Reservation reservation){
        return reservation_repository.save(reservation);
    }
    
    public void deleteReservation(Integer id){
        reservation_repository.deleteById(id);
    }
    
    public Table table_response(Integer id){

        Reservation reservation = reservation_repository.findById(id).get();
        
        ResponseEntity<Table> responseEntity = restTemplate.getForEntity(
                "http://localhost:8080/api/table/"+reservation.getNum_table(),
                Table.class);
        
        Table table = responseEntity.getBody();
        
        return table;       
    }
    
    public Employee employee_response(Integer id){
        
        Reservation reservation = reservation_repository.findById(id).get();
        
        ResponseEntity<Employee> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/employee/"+reservation.getCode_reservation(),
                Employee.class);
        
        Employee employee = responseEntity.getBody();
        
        return employee;
    }
    
    public Response response(Integer id){
        
        Response response = new Response();
        Reservation reservation = reservation_repository.findById(id).get();
        
        response.setTable(table_response(id));
        response.setEmployee(employee_response(id));
        response.setReservation(reservation);
        
        return response;
        
    }
}
