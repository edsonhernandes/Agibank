package com.agibank.S2IfWhileFor;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um número : ");
        int num = scan.nextInt();

        System.out.println(fibonacci(num));
    }

    private static long fibonacci(int num) {
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else {
            long resultado = fibonacci(num-1)+ fibonacci(num-2);
            return resultado;
        }
    }
}
