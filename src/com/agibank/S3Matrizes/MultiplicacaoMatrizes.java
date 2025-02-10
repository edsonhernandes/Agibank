package com.agibank.S3Matrizes;

/*
 Implemente a multiplicação de duas matrizes A e B, sendo A de dimensões m×n e B de dimensões n×p.
 Verifique se a multiplicação é possível antes de realizar o cálculo.
 */

import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada das dimensões da matriz A
        System.out.print("Digite o número de linhas da matriz A (lnMatrizA): ");
        int lnMatrizA = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz A (colMatrizA): ");
        int colMatrizA = sc.nextInt();

        // Entrada das dimensões da matriz B
        System.out.print("Digite o número de linhas da matriz B (lnMatrizB): ");
        int lnMatrizB = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz B (colMatrizB): ");
        int colMatrizB = sc.nextInt();

        // Verificação se a multiplicação é possível
        if (colMatrizA != lnMatrizB) {
            System.out.println("A multiplicação das matrizes não é possível. O número de colunas de A deve ser igual ao número de linhas de B.");
            return;
        }

        // Criação das matrizes A e B
        int[][] A = new int[lnMatrizA][colMatrizA];
        int[][] B = new int[colMatrizA][colMatrizB];
        int[][] C = new int[lnMatrizA][colMatrizB];

        // Entrada dos elementos da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < lnMatrizA; i++) {
            for (int j = 0; j < colMatrizA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Entrada dos elementos da matriz B
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < colMatrizA; i++) {
            for (int j = 0; j < colMatrizB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Multiplicação das matrizes A e B
        for (int i = 0; i < lnMatrizA; i++) {
            for (int j = 0; j < colMatrizB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colMatrizA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibindo o resultado
        System.out.println("Resultado da multiplicação das matrizes A e B:");
        for (int i = 0; i < lnMatrizA; i++) {
            for (int j = 0; j < colMatrizB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
