/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.CustomerSuper_service.Service;

import com.Js.CustomerSuper_service.Entity.CustomerSuper;
import com.Js.CustomerSuper_service.Repository.CustomerSuper_repository;
import com.Js.CustomerSuper_service.Response.Article;
import com.Js.CustomerSuper_service.Response.Employee;
import com.Js.CustomerSuper_service.Response.PaymentMethod;
import com.Js.CustomerSuper_service.Response.Reservation;
import com.Js.CustomerSuper_service.Response.Response;
import com.Js.CustomerSuper_service.Response.Table;
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
public class CustomerSuper_service {
    
    private final CustomerSuper_repository customerSuper_repository;
    
    private final RestTemplate restTemplate;
    
    public CustomerSuper saveCustomerSuper(CustomerSuper customerSuper){
        return customerSuper_repository.save(customerSuper);
    }
    
    public CustomerSuper getCustomerSuperById(Integer id){
        return customerSuper_repository.findById(id).get();
    }
    
    public List<CustomerSuper> findAllCustomerSuper(){
        return customerSuper_repository.findAll();
    }
    
    public CustomerSuper updateCustomerSuper(CustomerSuper customerSuper){
        return customerSuper_repository.save(customerSuper);
    }
    
    public void deleteCustomerSuperById(Integer id){
        customerSuper_repository.deleteById(id);
    }
    
    public Table table_response(Integer id){
        
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        ResponseEntity<Table> responseEntity = restTemplate.getForEntity(
                "http://localhost:8080/api/table/"+customerSuper.getNum_table(),
                Table.class);
        
        Table table = responseEntity.getBody();
        
        return table;
        
    }
    
    public Employee employee_response(Integer id){
        
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        ResponseEntity<Employee> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/employee/"+customerSuper.getCode_employee(),
                Employee.class);
        
        Employee employee = responseEntity.getBody();
        
        return employee;
    }
    
    public Reservation reservation_response(Integer id){
        
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        ResponseEntity<Reservation> responseEntity = restTemplate.getForEntity(
                "http://localhost:8082/api/reservation/"+customerSuper.getCode_reservation(),
                Reservation.class);
        
        Reservation reservation = responseEntity.getBody();
        
        return reservation;
    }
    
    public Article article_response(Integer id){
        
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        ResponseEntity<Article> responseEntity = restTemplate.getForEntity(
                "http://localhost:8083/api/article/"+customerSuper.getCode_article(),
                Article.class);
        
        Article article = responseEntity.getBody();
        
        return article;
    }
    
    public PaymentMethod paymentMethod_response(Integer id){
        
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        ResponseEntity<PaymentMethod> responseEntity = restTemplate.getForEntity(
                "http://localhost:8084/api/paymentMethod/"+customerSuper.getCode_paymentMethod(),
                PaymentMethod.class);
        
        PaymentMethod paymentMethod = responseEntity.getBody();
        
        return paymentMethod;
    }
    
    public Response response(Integer id){
        
        Response response = new Response();
        CustomerSuper customerSuper = customerSuper_repository.findById(id).get();
        
        response.setTable(table_response(id));
        response.setEmployee(employee_response(id));
        response.setReservation(reservation_response(id));
        response.setArticle(article_response(id));
        response.setPaymentMethod(paymentMethod_response(id));
        response.setCustomerSuper(customerSuper);
        
        return response;
    }
        
}
