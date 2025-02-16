package com.agibank.S3Matrizes;
/*
8. Verifique se uma matriz quadrada n×n é uma matriz identidade.
Definição: Uma matriz identidade possui 1s na diagonal principal e 0s em todos os outros elementos.

Exemplo de Entrada:
1 0 0
0 1 0
0 0 1

Exemplo de Saída:
A matriz é uma identidade
 */

import java.util.Scanner;

public class MatrizIdentidade {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // Solicita o tamanho da matriz
        System.out.print("Digite o tamanho da matriz (n x n): ");
        int n = scan.nextInt();

        // Cria a matriz
        int[][] matriz = new int[n][n];

        // Preenche a matriz com os valores
        System.out.println("Digite os elementos da matriz (linha por linha):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        // Verifica se a matriz é identidade
        if (isMatrizIdentidade(matriz, n)) {
            System.out.println("A matriz é uma identidade");
        } else {
            System.out.println("A matriz não é uma identidade");
        }

        scan.close();
    }

    // Método que verifica se a matriz é identidade
    public static boolean isMatrizIdentidade(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false; // Diagonal principal deve ser 1
                } else if (i != j && matriz[i][j] != 0) {
                    return false; // Fora da diagonal principal deve ser 0
                }
            }
        }
        return true;
    }
}
