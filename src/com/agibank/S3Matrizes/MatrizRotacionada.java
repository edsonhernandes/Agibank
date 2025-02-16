package com.agibank.S3Matrizes;
/*
10. Implemente uma função para rotacionar uma matriz quadrada n×n em 90 graus no sentido horário.

Exemplo de Entrada:
1 2 3
4 5 6
7 8 9
Exemplo de Saída:
7 4 1
8 5 2
9 6 3
 */

import java.util.Scanner;

public class MatrizRotacionada {

    // Função para rotacionar a matriz 90 graus no sentido horário
    public static void rotacionarMatriz90Graus(int[][] matriz) {
        int n = matriz.length;

        // Transpor a matriz (trocar linhas por colunas)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }

        // Inverter cada linha da matriz transposta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][n - 1 - j];
                matriz[i][n - 1 - j] = temp;
            }
        }
    }

    // Função para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho da matriz
        System.out.print("Digite o tamanho da matriz (n): ");
        int n = scanner.nextInt();

        // Criação da matriz
        int[][] matriz = new int[n][n];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibir a matriz original
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        // Rotacionar a matriz
        rotacionarMatriz90Graus(matriz);

        // Exibir a matriz rotacionada
        System.out.println("\nMatriz rotacionada 90 graus no sentido horário:");
        imprimirMatriz(matriz);

        scanner.close();
    }
}

