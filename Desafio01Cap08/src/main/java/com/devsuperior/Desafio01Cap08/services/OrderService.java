package com.devsuperior.Desafio01Cap08.services;

import com.devsuperior.Desafio01Cap08.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Double total(Order order) {
        return order.getBasic()
    }
}
