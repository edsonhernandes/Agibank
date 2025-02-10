package com.agibank.S3Matrizes;
/*
Dada uma matriz m×n, calcule e exiba a matriz transposta.

        Exemplo de Entrada:
        1 2 3
        4 5 6

        Exemplo de Saída:
        1 4
        2 5
        3 6
        */

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as dimensões da matriz
        System.out.print("Digite o número de linhas (ln): ");
        int ln = scanner.nextInt();
        System.out.print("Digite o número de colunas (col): ");
        int col = scanner.nextInt();

        // Criar e preencher a matriz original
        int[][] matrizOriginal = new int[ln][col];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        // Calcular a matriz transposta
        int[][] matrizTransposta = new int[col][ln];  // A transposta tem dimensões col×ln
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        // Exibir a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < ln; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
