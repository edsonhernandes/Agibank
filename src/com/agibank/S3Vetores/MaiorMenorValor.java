package com.agibank.S3Vetores;

// Identificação do Maior e Menor Valor de uma ação: Crie um programa que receba os preços de fechamento de uma ação
// durante 10 dias e identifique: O maior preço atingido e o menor preço registrado.

import java.util.Scanner;

public class MaiorMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double maiorPreco;
//        double menorPreco;

        System.out.print("Digite o preço de fechamento do dia 1: ");
        double preco = scanner.nextDouble();

        // Inicializa o maior e menor preço com um valor pré definido
//        double maiorPreco = 10;
//        double menorPreco = 8;

        // Inicializa o maior e menor preço com o valor do primeiro dia digitado
        double maiorPreco = preco;
        double menorPreco = preco;

        for (int i = 2; i <= 10; i++) { // começa iterar em i = 2 porque o i = 1  foi iniciado na declaração das variaveis acima:
            System.out.print("Digite o preço de fechamento do dia " + i + ": ");
            preco = scanner.nextDouble();

            // Verificando se o preço atual é o maior ou o menor
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }

        System.out.printf("O maior preço de fechamento é: %.2f\n", maiorPreco);
        System.out.printf("O menor preço de fechamento é: %.2f\n", menorPreco);

        scanner.close();
    }
}


