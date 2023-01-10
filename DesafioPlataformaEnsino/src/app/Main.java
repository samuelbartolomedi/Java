package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas aulas tem o curso? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i ++) {
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa? (c/t) ");
            char type = sc.next().charAt(0);
            System.out.print("Título? ");
            String title = sc.next();
            if (type == 'c') {
                
            }
        }
    }
}