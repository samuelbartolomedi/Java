import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        double[][] matriz = new double[n][n];

        double somaPositivos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d] [%d]: ", i, j);
                matriz[i][j] = sc.nextDouble();
                if (matriz[i][j] > 0) {
                    somaPositivos = somaPositivos + matriz[i][j];
                }
            }
        }

        System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n", somaPositivos);

        System.out.print("Escolha uma linha: ");
        int linhaEscolhida = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ",matriz[linhaEscolhida][i]);
        }

        System.out.print("\n\nEscolha um coluna: ");
        int colunaEscolhida = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ",matriz[i][colunaEscolhida]);
        }

        System.out.print("\n\nDIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ",matriz[i][i]);
        }

        System.out.println("\n\nMATRIZ ALTERADA: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
                System.out.printf("%.1f ",matriz[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}