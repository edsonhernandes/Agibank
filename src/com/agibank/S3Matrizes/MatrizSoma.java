package com.agibank.S3Matrizes;
/*
Receba uma matriz 4x4 de números inteiros e calcule:
        A soma de todos os elementos da matriz.
        A soma dos elementos de cada linha.
        A soma dos elementos de cada coluna.
         */

import java.util.Scanner;

public class MatrizSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o tamanho da matriz (4x4)
        int[][] matriz = new int[4][4];

        // Receber os valores da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int ln = 0; ln < 4; ln++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Elemento [" + ln + "][" + col + "]: ");
                matriz[ln][col] = scanner.nextInt();
            }
        }

        // Calcular a soma de todos os elementos da matriz
        int somaTotal = 0;
        for (int ln = 0; ln < 4; ln++) {
            for (int col = 0; col < 4; col++) {
                somaTotal += matriz[ln][col];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);
        System.out.println("");

        // Calcular a soma dos elementos de cada linha
        System.out.println("Soma dos elementos de cada linha:");
        for (int ln = 0; ln < 4; ln++) {
            int somaLinha = 0;
            for (int col = 0; col < 4; col++) {
                somaLinha += matriz[ln][col];
            }
            System.out.println("Soma da linha " + ln + ": " + somaLinha);
        }
        System.out.println("");

        // Calcular a soma dos elementos de cada coluna
        System.out.println("Soma dos elementos de cada coluna:");
        for (int col = 0; col < 4; col++) {
            int somaColuna = 0;
            for (int ln = 0; ln < 4; ln++) {
                somaColuna += matriz[ln][col];
            }
            System.out.println("Soma da coluna " + col + ": " + somaColuna);
        }

        scanner.close();
    }
}
