import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdAtletas = 0;
        double altura = 0,
                maiorAltura = 0,
                peso = 0,
                pesoTotal = 0,
                pesoMedioAtletas = 0,
                alturaTotalMulheres = 0,
                alturaMediaMulheres = 0,
                percentagemHomens = 0,
                qtdHomens = 0,
                qtdMulheres = 0;
                String nome = " ", nomeMaisAlto = " ";
                char sexo = ' ';

        System.out.println("Qual a quantidade de atletas? ");
        qtdAtletas = sc.nextInt();

        while (qtdAtletas <= 0){
            System.out.println("O número de atletas não pode ser negativo!");
            qtdAtletas = sc.nextInt();
        }

        int i = 0;

        for (i = 1; i <= qtdAtletas; i++) {
            System.out.println("Informe os dados do atleta número " + i);
            System.out.println("Nome: ");
            nome = sc.next();
            System.out.println("Sexo: ");
            sexo = sc.next().charAt(0);

            while (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo invalido, deve ser m ou f");
                sexo = sc.next().charAt(0);
            }

            if (sexo == 'm') {
                qtdHomens++;
            } else {
                qtdMulheres++;
            }

            System.out.println("Altura:");
            altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.println("Altura invalida, insira um valor positivo");
                altura = sc.nextDouble();
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }

            System.out.println("Peso:");
            peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.println("Peso invalido, insira um valor positivo");
                peso = sc.nextDouble();
            }

            pesoTotal = pesoTotal + peso;

            if (sexo == 'f') {
                alturaTotalMulheres = alturaTotalMulheres + altura;
            }
        }
        pesoMedioAtletas = pesoTotal / qtdAtletas;

        alturaMediaMulheres = alturaTotalMulheres / qtdMulheres;

        percentagemHomens = (qtdHomens / qtdAtletas) * 100.0;

        if (qtdMulheres != 0){
            System.out.printf("RELATÓRIO FINAL: \n" +
                    "Peso médio dos atletas: " + pesoMedioAtletas +"\n" +
                    "Atleta mais alto: " + nomeMaisAlto + "\n" +
                    "Porcentagem de homens: " + percentagemHomens + "%\n" +
                    "Altura média das mulheres: " + alturaMediaMulheres);
        }

        else {
            System.out.printf("RELATÓRIO FINAL: \n" +
                    "Peso médio dos atletas: " + pesoMedioAtletas + "\n" +
                    "Atleta mais alto: " + nomeMaisAlto + "\n" +
                    "Porcentagem de homens: " + percentagemHomens + "%\n" +
                    "Não há mulheres cadastradas");
        }
    }
}