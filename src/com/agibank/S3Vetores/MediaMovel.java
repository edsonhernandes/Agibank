package com.agibank.S3Vetores;

//Calcule a média movel de um ativo:
//A média móvel de um ativo financeiro é usada para suavizar flutuações de curto prazo e identifiar tendencias.
// Crie um programa que : Receba os preços de um ativo nos últimos 7 dias e calcule a média móvel simples dos
// últimos 3 dias:

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços do ativo em 7 dias
        double[] precos = new double[7];

        System.out.println("Digite os preços do ativo para os últimos 7 dias de negociação:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        double mediaMovel = (precos[4] + precos[5] + precos[6]) / 3;

        System.out.println("");

        System.out.printf("A Média móvel dos últimos 3 dias é: %.2f\n", mediaMovel);

        scanner.close();
    }
}

