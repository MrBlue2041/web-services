package com.example.webservicess.repository;

import com.example.webservicess.entities.Payment;
import com.example.webservicess.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
