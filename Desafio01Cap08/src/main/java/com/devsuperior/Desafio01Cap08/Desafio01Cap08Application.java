package com.devsuperior.Desafio01Cap08;

import com.devsuperior.Desafio01Cap08.entities.Order;
import com.devsuperior.Desafio01Cap08.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior.Desafio01Cap08"})
public class Desafio01Cap08Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Cap08Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nro do pedido:");
        Integer code = sc.nextInt();
        System.out.println("Informe o valor do pedido:");
        Double basic = sc.nextDouble();
        System.out.println("Informe o desconto do pedido:");
        Double discount = sc.nextDouble();
        Order order = new Order(code, basic, discount);

        System.out.println("Dados do pedido:");
        System.out.println("Pedido código: " + order.getCode());
        System.out.println("Valor total: " + orderService.total(order));

        sc.close();
    }
}
