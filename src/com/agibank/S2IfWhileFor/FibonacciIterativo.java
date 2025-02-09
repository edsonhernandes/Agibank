package com.agibank.S2IfWhileFor;

import java.util.Scanner;

public class FibonacciIterativo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um número : ");
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("Não existe numero menor que 0 em Fibonacci");
        } else if (num == 1) {
            System.out.println(0);
        } else {
            int num2 = 0;
            int num1 = 1;
            int fibonacci = 0;

            System.out.println(0);

            while (fibonacci < num) {
                fibonacci = num2 + num1;
                System.out.println(num1);

                num2 = num1;
                num1 = fibonacci;
            }
        }
    }
}
