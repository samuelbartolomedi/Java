package App;

import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite os dados do %do contribuinte", i + 1);
            System.out.println();
            System.out.print("Renda anual com salário? ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com serviços? ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital? ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos? ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais? ");
            double educationSpending = sc.nextDouble();
            taxPayerList.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
        }

        System.out.println();
        for (TaxPayer obj : taxPayerList) {
                System.out.print("Resumo do contribuinte:");
                System.out.println();
                System.out.println(obj);
            }
            sc.close();
        }
    }