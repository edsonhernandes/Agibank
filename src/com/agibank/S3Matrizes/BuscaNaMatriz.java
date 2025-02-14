package com.agibank.S3Matrizes;
/*
6. Receba uma matriz n×m e um número inteiro. Verifique se o número está presente na matriz.
Caso esteja, exiba as posições (linha e coluna) onde o número aparece.
Exemplo de Saída:
Número encontrado na posição: linha 2, coluna 2
Exemplo de Entrada:

Matriz:
1 2 3
4 5 6
7 8 9

Número: 5
 */

import java.util.Scanner;

public class BuscaNaMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das dimensões da matriz
        System.out.print("Digite o número de linhas: ");
        int ln = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int col = scanner.nextInt();

        // Criando a matriz
        int[][] matriz = new int[ln][col];

        // Preenchendo a matriz com valores
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Entrada do número a ser buscado
        System.out.print("Digite o número a ser buscado: ");
        int numero = scanner.nextInt();

        // Flag para verificar se o número foi encontrado
        boolean encontrado = false;

        // Buscando o número na matriz
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Número encontrado na posição: linha " + (i + 1) + ", coluna " + (j + 1));
                    encontrado = true;
                }
            }
        }

        // Caso o número não tenha sido encontrado
        if (!encontrado) {
            System.out.println("Número não encontrado na matriz.");
        }

        scanner.close();
    }
}
