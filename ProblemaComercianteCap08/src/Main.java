import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Serão digitados dados de quantos produtos? ");
        int n = sc.nextInt();

        String[] produtos = new String[n];
        double[] precosCompra = new double[n];
        double[] precosVenda = new double[n];
        double[] lucros = new double[n];
        double[] percentagemLucro = new double [n];
        int abaixo10 = 0;
        int entre10e20 = 0;
        int acima20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroTotal = 0;

        for (int i = 0; i < n; i++){
            System.out.printf("Produto %d:\n", i + 1);
            System.out.print("Nome: ");
            produtos[i] = sc.next();
            System.out.print("Preço de compra: ");
            precosCompra[i] = sc.nextDouble();
            System.out.print("Preço de venda: ");
            precosVenda[i] = sc.nextDouble();
            lucros[i] = precosVenda[i] - precosCompra[i];
            percentagemLucro[i] = lucros[i] / precosCompra[i] * 100;
            if (percentagemLucro[i] < 10) {
                abaixo10++;
            } else if (percentagemLucro[i] >= 10 && percentagemLucro[i] <= 20) {
                entre10e20++;
            }
            else {
                acima20++;
            }
            valorTotalCompra = valorTotalCompra + precosCompra[i];
            valorTotalVenda = valorTotalVenda + precosVenda[i];
        }
        lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo10);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre10e20);
        System.out.printf("Lucro acima de 20%%: %d\n", acima20);
        System.out.printf("Valor total de compra: %.2f\n", valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f\n", valorTotalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

    }
}