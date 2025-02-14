package com.agibank.S3Matrizes;
/*
Faça um programa em java que  Receba uma matriz quadrada n×n e calcule a soma dos elementos
da diagonal principal e da diagonal secundária.

Exemplo de Entrada:
Matriz:
1 2 3
4 5 6
7 8 9

Exemplo de Saída:
Soma da Diagonal Principal: 15 Soma da
Diagonal Secundária: 15
 */

import java.util.Scanner;

public class SomaDiagonais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho da matriz
        System.out.print("Digite o tamanho da matriz (tam): ");
        int tam = scanner.nextInt();

        // Declaração da matriz tam x tam
        int[][] matriz = new int[tam][tam];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Variáveis para armazenar as somas das diagonais
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        // Cálculo das somas das diagonais
        for (int i = 0; i < tam; i++) {
            somaDiagonalPrincipal += matriz[i][i]; // Diagonal principal
            somaDiagonalSecundaria += matriz[i][tam - i - 1]; // Diagonal secundária
        }

        // Exibição dos resultados formatados
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}

