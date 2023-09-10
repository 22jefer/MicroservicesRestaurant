/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Article_service.Controller;

import com.Js.Article_service.Entity.Article;
import com.Js.Article_service.Service.Article_service;
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
@RequestMapping("/api/article")
@AllArgsConstructor
@Data
public class Article_controller {
    
    private final Article_service article_service;
    
    @PostMapping
    public Article saveArticle(@RequestBody Article article){
        return article_service.savaArticle(article);
    }
    
    @GetMapping("{id}")
    public Article getArticleById(@PathVariable Integer id){
        return article_service.getArticleById(id);
    }
    
    @GetMapping
    public List<Article> findAllArticle(){
        return article_service.findAllArticle();
    }
    
    @PutMapping
    public Article updateArticle(@RequestBody Article article){
        return article_service.updateArticle(article);
    }
    
    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id){
        article_service.deleteArticle(id);
    }
    
}
