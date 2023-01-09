package app;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        System.out.println("Number of products? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported? (c/u/i) ");
            char type = sc.next().charAt(0);
            System.out.print("Name? ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price? ");
            double price = sc.nextDouble();
            if (type == 'c') {
                productList.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Manufacture date? (DD/MM/YYYY) ");
                Date date = sdf.parse(sc.next());
                productList.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee? ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}