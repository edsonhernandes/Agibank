package com.agibank.S3Vetores;

//Crie um programa que receba um vetor com os preços de compra e um vetor com os preços de venda de 5 ativos
// diferentes. O programa deve calcular o ganho ou perda de cada ativo e, se o lucro total ultrapassar R$ 20000,00
//  calcular o imposto de 15% sobre o lucro excedente. Caso contrário exibir uma mensagem que Não há imposto devido

import java.util.Scanner;

public class ImpostoGanhosCapital {

    public static void main(String[] args) {

        double[] precoCompra = new double[5];
        double[] precoVenda = new double[5];
        double resultadoTotal = 0; //contador

        Scanner scan = new Scanner(System.in);

        // Input dos preços de compra e venda das ações
        System.out.println("Digite os preços de compra e venda de 5 ações :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Preço de compra da ação " + (i + 1) + ": ");
            precoCompra[i] = scan.nextDouble();
            System.out.print("Preço de venda da ação " + (i + 1) + ": ");
            precoVenda[i] = scan.nextDouble();
            System.out.println("");
        }

        // Calculando o lucro ou perda de cada ação e o resultado total
        for (int i = 0; i < 5; i++) {
            double resultado = precoVenda[i] - precoCompra[i];
            resultadoTotal += resultado;
            System.out.println("O resultado da venda da ação " + (i + 1) + " é : R$ " + resultado);
        }

        System.out.println("");
        System.out.println("O resultado total das operações é : R$ " + resultadoTotal);
        System.out.println("");

        // Verificando se o lucro total ultrapassa R$ 20.000,00
        if (resultadoTotal > 20000) {
            double imposto = (resultadoTotal - 20000) * 0.15; // Calculo do imposto

            System.out.println("O Lucro excedente é : R$ " + (resultadoTotal - 20000));
            System.out.println("");
            System.out.println("Imposto de 15% sobre o lucro excedente: R$ " + imposto);
        } else {
            System.out.println("Não há imposto devido.");
        }

        scan.close();
    }
}

