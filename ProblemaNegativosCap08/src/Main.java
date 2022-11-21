import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vc vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for (int i = 0; i < n; i++){
            if (vetor[i] < 0) {
                System.out.println(String.valueOf(vetor[i]));
            }
        }
           sc.close();
        }
    }