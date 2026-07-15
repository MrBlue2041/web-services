package com.example.webservicess.resources;

import com.example.webservicess.entities.Order;
import com.example.webservicess.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService orderService;

    @GetMapping
    ResponseEntity<List<Order>> findAll(){
        List<Order> users = orderService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    ResponseEntity<Order> findById(@PathVariable Long id){
        Order user = orderService.findById(id);
        return ResponseEntity.ok(user);
    }
}
