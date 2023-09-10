/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Table_service.Service;

import com.Js.Table_service.Entity.Table;
import com.Js.Table_service.Repository.Table_repository;
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
public class Table_service {
    
    private final Table_repository table_repository;
    
    public Table saveTable(Table table){
        return table_repository.save(table);
    }
    
    public Table getTableById(Integer id){
        return table_repository.findById(id).get();
    }
    
    public List<Table> listTable(){
        return table_repository.findAll();
    }
    
    public Table updateTable(Table table){
        return table_repository.save(table);
    }
    
    public void deleteTableById(Integer id){
        table_repository.deleteById(id);
    }
   
}
