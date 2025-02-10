package com.agibank.S3Matrizes;

/*
Crie uma matriz 3x3 de números inteiros e preencha-a manualmente. Em seguida, imprima os elementos da matriz
no formato de tabela.  Exemplo de Saída:
        1 2 3
        4 5 6
        7 8 9
 */

public class Matriz3x3 {
    public static void main(String[] args) {
        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz manualmente
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Imprimindo a matriz no formato de tabela
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}

