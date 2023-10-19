package com.devsuperior.Desafio01Cap08;

import com.devsuperior.Desafio01Cap08.services.OrderService;
import com.devsuperior.Desafio01Cap08.services.ShippingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior.Desafio01Cap08"})
public class Desafio01Cap08Application {
    private OrderService orderService;
    private ShippingService shippingService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Cap08Application.class, args);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nro do pedido:");
        Integer code = sc.nextInt();
        System.out.println("Informe o valor do pedido:");
        Double basic = sc.nextDouble();
        System.out.println("Informe o desconto do pedido:");
        Double discount = sc.nextDouble();
    }
//teste
}
