package com.example.webservicess.resources;

import com.example.webservicess.entities.Product;
import com.example.webservicess.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping
    ResponseEntity<List<Product>> findAll(){
        List<Product> users = productService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id){
        Product user = productService.findById(id);
        return ResponseEntity.ok(user);
    }
}
