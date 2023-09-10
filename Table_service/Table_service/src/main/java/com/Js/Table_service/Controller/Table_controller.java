/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Table_service.Controller;

import com.Js.Table_service.Entity.Table;
import com.Js.Table_service.Service.Table_service;
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
@RequestMapping("/api/table")
@AllArgsConstructor
@Data
public class Table_controller {
    
    private final Table_service table_service;
    
    @PostMapping
    public Table saveTable(@RequestBody Table table){
        return table_service.saveTable(table);
    }
    
    @GetMapping("/{id}")
    public Table getTableById(@PathVariable Integer id){
        return table_service.getTableById(id);
    }
    
    @GetMapping
    public List<Table> listTable(){
        return table_service.listTable();
    }
    
    @PutMapping
    public Table updateTable(@RequestBody Table table){
        return table_service.updateTable(table);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTableById(@PathVariable Integer id){
        table_service.deleteTableById(id);
    }
    
}
