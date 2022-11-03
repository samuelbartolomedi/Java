import Entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.println("Informe o sexo do cliente: ");
        bill.gender = sc.next().charAt(0);
        System.out.println("Informe a qtd de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.println("Informe a qtd de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.println("Informe a qtd de espetinhos: ");
        bill.barbecue = sc.nextInt();

        if (bill.feeding() > 30.0) {
            System.out.println("RELATÓRIO:\n" +
                    "Consumo= R$ " + bill.feeding() + "\n" +
                    "Isento de Couvert\n" +
                    "Ingresso = R$ " + bill.ticket() + "\n" +
                    "\n" +
                    "Valor a pagar = R$ " + bill.total());
        } else {
            System.out.println("RELATÓRIO:\n" +
                    "Consumo= R$ " + bill.feeding() + "\n" +
                    "Couvert = R$ " + bill.cover() + "\n" +
                    "Ingresso = R$ " + bill.ticket() + "\n" +
                    "\n" +
                    "Valor a pagar = R$ " + bill.total());
        }
    }
}