package main;

import java.util.Locale;
import java.util.Scanner;

public class Pedido {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("----------------------");
        System.out.println("cachorro-quente");
        System.out.println("X-salada");
        System.out.println("X-bacon");
        System.out.println("Misto");
        System.out.println("Salada");
        System.out.println("Agua");
        System.out.println("Refrigerante");
        System.out.println("----------------------");
        System.out.println("Faça seu pedido");
        int product = sc.nextInt();

        while (product >= 0 && product <= 2) {
            switch (product) {
                case 1:
                    System.out.println("cachorro-quente");
                    product = sc.nextInt();
                case 2:
                    System.out.println("X-salada");
                    product = sc.nextInt();
                case 3:
                    System.out.println("X-bacon");
                    product = sc.nextInt();
                case 4:
                    System.out.println("Misto");
                    product = sc.nextInt();
                case 5:
                    System.out.println("Salada");
                    product = sc.nextInt();
                case 6:
                    System.out.println("Agua");
                    product = sc.nextInt();
                case 7:
                    System.out.println("Refrigerante");
                    product = sc.nextInt();

            }


            }


            sc.close();
        }
    }
