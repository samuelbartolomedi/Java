import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a renda anual com salário:");
        double rendaSalario = sc.nextDouble();

        System.out.println("Informe a renda anual com serviços:");
        double rendaServicos = sc.nextDouble();

        System.out.println("Informe a renda anual com ganho de capital:");
        double rendaGanhoCapital = sc.nextDouble();

        System.out.println("Informe os gastos médicos:");
        double gastosMedicos = sc.nextDouble();

        System.out.println("Informe os gastos educacionais:");
        double gastosEducacionais = sc.nextDouble();


        double impostoSalario;
        double impostoServico;
        double impostoGanhoCapital;
        double brutoImpostos;
        double maxDedutivel;
        double totalGastos;
        double liquidoImpostos;

        if (rendaSalario < 36000) {
            impostoSalario = rendaSalario * 0.0;
        }

        if (rendaSalario >= 36000 && rendaSalario <= 60000) {
            impostoSalario = rendaSalario * 0.10;
        } else {
            impostoSalario = rendaSalario * 0.20;
        }

        if (rendaServicos > 0.0) {
            impostoServico = rendaServicos * 0.15;
        } else {
            impostoServico = rendaServicos * 0.0;
        }

        if (rendaGanhoCapital > 0.0) {
            impostoGanhoCapital = rendaGanhoCapital * 0.20;
        } else {
            impostoGanhoCapital = rendaGanhoCapital * 0.0;
        }

        brutoImpostos = impostoGanhoCapital + impostoSalario + impostoServico;
        maxDedutivel = brutoImpostos * 0.30;
        totalGastos = gastosMedicos + gastosEducacionais;

        if (totalGastos > maxDedutivel){
            liquidoImpostos = brutoImpostos - maxDedutivel;
            System.out.printf("RELATÓRIO DE IMPOSTO DE RENDA\n" +
                    "\n" +
                    "CONSOLIDADO DE RENDA:\n" +
                    "Imposto sobre salário: " + impostoSalario + "\n" +
                    "Imposto sobre serviços: " + impostoServico + "\n" +
                    "Imposto sobre ganho de capital: " + impostoGanhoCapital + "\n" +
                    "\n" +
                    "DEDUÇÕES:\n" +
                    "Máximo dedutível: " + maxDedutivel + "\n" +
                    "Gastos dedutíveis: " + totalGastos + "\n" +
                    "\n" +
                    "RESUMO:\n" +
                    "Imposto bruto total: " + brutoImpostos + "\n" +
                    "Abatimento: " + maxDedutivel + "\n" +
                    "Imposto devido: " + liquidoImpostos);
        }
        else {
            liquidoImpostos = brutoImpostos - totalGastos;
            System.out.printf("RELATÓRIO DE IMPOSTO DE RENDA\n" +
                    "\n" +
                    "CONSOLIDADO DE RENDA:\n" +
                    "Imposto sobre salário: " + impostoSalario + "\n" +
                    "Imposto sobre serviços: " + impostoServico + "\n" +
                    "Imposto sobre ganho de capital: " + impostoGanhoCapital + "\n" +
                    "\n" +
                    "DEDUÇÕES:\n" +
                    "Máximo dedutível: " + maxDedutivel + "\n" +
                    "Gastos dedutíveis: " + totalGastos + "\n" +
                    "\n" +
                    "RESUMO:\n" +
                    "Imposto bruto total: " + brutoImpostos + "\n" +
                    "Abatimento: " + totalGastos + "\n" +
                    "Imposto devido: " + liquidoImpostos);
        }
        sc.close();
    }
}