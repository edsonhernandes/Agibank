package com.agibank.S2IfWhileFor;

import java.util.Scanner;

public class numQuadrado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um numero : ");
        int numero = scan.nextInt();

        int total = 0;
        int numA = 1;

        while (numero > 0){
            if(numA%2 != 0){
                total = total + numA;
                numero--;
            }
            numA++;
        }
        System.out.println("O total é : " + total);

    }
}
