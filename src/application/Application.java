package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Application {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DESAFIO: Combate");
        System.out.println();

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        Champion champion1 = new Champion(name, life, attack, armor);
        
        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        String name2 = sc.next();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();
        Champion champion2 = new Champion(name2, life2, attack2, armor2);
        

        sc.close();

    }
}
