package com.agibank.S3Vetores;

//Crie um programa que receba um vetor com os preços diarios de uma ação durante 10 dias e identifique :
// a)Quantos dias tiveram alta(Preço maior que o dia anterior) b) Quantos dias tiveram queda(Preço menor que o dia anterior)

import java.util.Scanner;

public class DiasAltaeQueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os preços da ação para 10 dias:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preço do dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Contadores
        int diasAlta = 0;
        int diasQueda = 0;

        // Comparação dos preços para ver se tem sequencia de baixa ou alta:
        for (int i = 1; i < 10; i++) {
            if (precos[i] > precos[i - 1]) {
                diasAlta++;
            } else if (precos[i] < precos[i - 1]) {
                diasQueda++;
            }
        }
        System.out.println("");
        System.out.println("Quantidade de dias com alta: " + diasAlta);
        System.out.println("---------------------------------------------------");
        System.out.println("Quantidade de dias com queda: " + diasQueda);

        scanner.close();
    }
}
