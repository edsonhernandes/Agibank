package com.agibank.S3Matrizes;
/*
9. Dada uma matriz n×m de números reais, normalize os valores, dividindo cada elemento pelo maior valor
presente na matriz.
Exemplo de Entrada:
2.0 4.0 6.0 8.0 10.0 12.0

Exemplo de Saída:
0.17 0.33 0.50 0.67 0.83 1.00
 */

import java.util.Scanner;

public class MatrizNormalizada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Leitura das dimensões da matriz (número de linhas e colunas)
        System.out.println("Digite o número de linhas da matriz:");
        int ln = scan.nextInt();

        System.out.println("Digite o número de colunas da matriz:");
        int col = scan.nextInt();

        // Criação da matriz
        double[][] matriz = new double[ln][col];

        System.out.println("Digite os valores da matriz:");

        // Preenchendo a matriz com os valores fornecidos
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }

        // Encontrando o maior valor na matriz
        double maiorValor = matriz[0][0];
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Normalizando a matriz
        System.out.println("Matriz normalizada:");
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < col; j++) {
                double valorNormalizado = matriz[i][j] / maiorValor;
                System.out.printf("%.2f ", valorNormalizado);
            }
            System.out.println();
        }

        scan.close();
    }
}

