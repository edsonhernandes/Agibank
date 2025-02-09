package com.agibank.S2IfWhileFor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int numero = scan.nextInt();

        for (int multiplicador = 0; multiplicador <=10;multiplicador++ ) {
            int resultado = numero*multiplicador;
            System.out.println("O resultado é: " + resultado);

        }

        int multiplicadorA = 0;

        while (multiplicadorA <= 10){
            int resultadoA = numero*multiplicadorA;
            System.out.println("O resultado é: " + resultadoA);
            multiplicadorA ++;
        }

    }
}
