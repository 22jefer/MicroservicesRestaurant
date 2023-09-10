/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.PaymentMethod.Service;

import com.Js.PaymentMethod.Entity.PaymentMethod;
import com.Js.PaymentMethod.Repository.PaymentMethod_repository;
import com.Js.PaymentMethod.Response.Article;
import com.Js.PaymentMethod.Response.Response;
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
public class PaymentMethod_service {
    
    private final PaymentMethod_repository paymentMethod_repository;
    
    private final RestTemplate restTemplate;
    
    public PaymentMethod savePaymentMethod(PaymentMethod paymentMetho){
        return paymentMethod_repository.save(paymentMetho);
    }
    
    public PaymentMethod getPaymentMethodById(Integer id){
        return paymentMethod_repository.findById(id).get();
    }
    
    public List<PaymentMethod> findAllPaymentMethod(){
        return paymentMethod_repository.findAll();
    }
    
    public PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod){
        return paymentMethod_repository.save(paymentMethod);
    }
    
    public void deletePaymentMethodById(Integer id){
        paymentMethod_repository.deleteById(id);
    }
    
    public Article article_response(Integer id){
        
        PaymentMethod paymentMethod = paymentMethod_repository.findById(id).get();
        
        
        ResponseEntity<Article> responseEntity = restTemplate.getForEntity(
                "http://localhost:8083/api/article/"+paymentMethod.getCode_article(),
                Article.class);
        
        Article article = responseEntity.getBody();
        
        return article;
        
    }
    
    public Response response(Integer id){
        
        Response response = new Response();
        PaymentMethod paymentMethod = paymentMethod_repository.findById(id).get();
        
        response.setArticle(article_response(id));
        response.setPaymentMethod(paymentMethod);
        
        return response;
    }
    
}
