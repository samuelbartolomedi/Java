package app;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.next();
        System.out.print("Dia do pagamento: ");
        Integer departmentPayDay = sc.nextInt();
        System.out.print("Email: ");
        String addressEmail = sc.next();
        System.out.print("Telefone: ");
        String addressPhone = sc.next();
        System.out.print("Quantos funcionários tem o departamento? ");
        Integer n = sc.nextInt();

        Department department = new Department(departmentName, departmentPayDay, new Address(addressEmail, addressPhone));

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionário " + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            Double employeeSalary = sc.nextDouble();

            Employee employee = new Employee(employeeName, employeeSalary);
            department.addEmployee(employee);
        }

        showReport(department);
        sc.close();
    }

    private static void showReport(Department department) {
        System.out.println(department);
    }
}