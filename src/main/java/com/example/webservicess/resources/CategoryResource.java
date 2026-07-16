package com.example.webservicess.resources;

import com.example.webservicess.entities.Category;
import com.example.webservicess.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService categoryServiceService;

    @GetMapping
    ResponseEntity<List<Category>> findAll(){
        List<Category> users = categoryServiceService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    ResponseEntity<Category> findById(@PathVariable Long id){
        Category user = categoryServiceService.findById(id);
        return ResponseEntity.ok(user);
    }
}
