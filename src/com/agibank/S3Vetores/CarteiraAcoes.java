package com.agibank.S3Vetores;

//Crie um programa que armazene em um vetor os valores de 5 ações diferentes na carteira de um investidor.
// Em seguida, o programa deve calcular e exibir : a) O total investido somando os valores b) O percentual de cada ação na carteira

import java.util.Scanner;

public class CarteiraAcoes {

    public static void main(String[] args) {

        double[] acoes = new double[5];
        double totalInvestido = 0.0; //acumulador

        Scanner scan = new Scanner(System.in);

        // Coleta dos valores das ações
        System.out.println("Digite o valor de cada ação:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor da ação " + (i + 1) + ": ");
            acoes[i] = scan.nextDouble();
            totalInvestido += acoes[i];
        }

        System.out.println("");
        System.out.printf("O valor total investido é: R$ %.2f" , totalInvestido);
        System.out.println("");
        System.out.println("----------------------------------------------------------");

        // Calculo do percentual de cada ação na carteira
        System.out.println("\nO percentual de cada ação na carteira é: \n");
        for (int i = 0; i < 5; i++) {
            double percentual = (acoes[i] / totalInvestido) * 100;
            System.out.printf("Ação %d: %.2f%%\n", (i + 1), percentual);
        }

        scan.close();
    }
}
