package com.example.webservicess.repository;

import com.example.webservicess.entities.Order;
import com.example.webservicess.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
