package com.agibank.S3Matrizes;
/*
Receba uma matriz quadrada n×n e exiba os elementos da diagonal principal.

        Exemplo de Entrada:

        1 2 3

        4 5 6

        7 8 9

        Exemplo de Saída:

        Diagonal Principal: 1 5 9
        */

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        // Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho da matriz
        System.out.print("Digite o tamanho da matriz (n): ");
        int n = scanner.nextInt();

        // Inicializando a matriz
        int[][] matriz = new int[n][n];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz (linha por linha):");
        for (int ln = 0; ln < n; ln++) {
            for (int col = 0; col < n; col++) {
                matriz[ln][col] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int ln = 0; ln < n; ln++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matriz[ln][col] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

        // Exibindo os elementos da diagonal principal
        System.out.print("Diagonal Principal: ");
        for (int ln = 0; ln < n; ln++) {
            System.out.print(matriz[ln][ln] + " ");
        }

        // Fechando o scanner
        scanner.close();
    }
}
