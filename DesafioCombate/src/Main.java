import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion c1 = new Champion();
        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.println("Nome: ");
        c1.setName(sc.next());
        System.out.println("Vida inicial: ");
        c1.setLife(sc.nextInt());
        System.out.println("Ataque: ");
        c1.setAttack(sc.nextInt());
        System.out.println("Armadura: ");
        c1.setArmor(sc.nextInt());

        Champion c2 = new Champion();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.println("Nome: ");
        c2.setName(sc.next());
        System.out.println("Vida inicial: ");
        c2.setLife(sc.nextInt());
        System.out.println("Ataque: ");
        c2.setAttack(sc.nextInt());
        System.out.println("Armadura: ");
        c2.setArmor(sc.nextInt());

        System.out.println("Quantos turnos você deseja executar?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (c1.getLife() <= 0 || c2.getLife() <= 0) {
                break;
            } else {
            System.out.println();
            System.out.println("Resultado do turno " + i + ":");
            c1.takeDamage(c2);
            c2.takeDamage(c1);
            System.out.println(c1.status());
            System.out.println(c2.status());
            }
        }

        System.out.println();
        System.out.println("FIM DE COMBATE");
    }
}