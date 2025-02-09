package com.agibank.S2IfWhileFor;

import java.util.Scanner;

public class NumElevado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int x = scan.nextInt();

        System.out.println("Digite outro numero : ");
        int y = scan.nextInt();

        int expoente = Math.abs(y);

        if (expoente == 0) {
            System.out.println(1);
            return;
        }
        double total = x;

        while (expoente > 1) {
            total = total * x;
            expoente--;
        }

        if (y < 0) {
            total = 1 / total;
        }
        System.out.println("O valor da potenciação é: " + total);

        System.out.println("Potenciação usando math.pow " + Math.pow(x, y));
    }
}
