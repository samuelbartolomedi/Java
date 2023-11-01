package com.devsuperior.Desafio01Cap08.services;

import com.devsuperior.Desafio01Cap08.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {
        return order.getBasic() - (order.getDiscount() / 100 * order.getBasic()) + shippingService.shipment(order);
    }
}
