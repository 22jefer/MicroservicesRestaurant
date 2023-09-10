/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Article_service.Service;

import com.Js.Article_service.Entity.Article;
import com.Js.Article_service.Repository.Article_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
@AllArgsConstructor
@Data
public class Article_service {
    
    private final Article_repository article_repository;
    
    public Article savaArticle(Article article){
        return article_repository.save(article);
    }
    
    public Article getArticleById(Integer id){
        return article_repository.findById(id).get();
    }
    
    public List<Article> findAllArticle(){
        return article_repository.findAll();
    }
    
    public Article updateArticle(Article article){
        return article_repository.save(article);
    }
    
    public void deleteArticle(Integer id){
        article_repository.deleteById(id);
    }
}
