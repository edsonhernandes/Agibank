package com.agibank.S3Vetores;

//Crie um programa que receba um vetor com os preços diários de uma ação durante 5 dias e calcule
// a variação percentual diária. formula : variação = ((valor atual - valor anterior)/ valor anterior) * 100

import java.util.Scanner;

public class VariacaoPercentual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[5];
        System.out.println("Digite os preços da ação para 5 dias:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Preço do dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Calculo da variação percentual diária

        System.out.println("");
        System.out.println("Variação percentual diária:");
        for (int i = 1; i < 5; i++) {
            double variacao = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
            System.out.printf("Variação do dia %d para o dia %d: %.2f%%\n", i, i + 1, variacao);
        }
        scanner.close();
    }
}


