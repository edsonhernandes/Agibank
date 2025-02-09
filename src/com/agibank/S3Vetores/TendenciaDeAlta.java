package com.agibank.S3Vetores;

//Crie um programa  que recebe um vetor com os preços diarios de uma ação ao longo de 10 dias.
// O programa deve :  identificar se o mercado está em tendencia de alta(preços aumentam continuamente
// por mais de 3 dias consecutivos, podendo ser mais de 3 dias) e caso exista uma tendencia de alta,
// imprimir os dias que compoe a tendencia de alta atraves dos indices do vetor.
// Caso contrario, imprimir sem tendencia de alta.

import java.util.Scanner;

public class TendenciaDeAlta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[10];

        System.out.println("Digite os preços das ações:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Preço do dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Verificação de tendência de alta:
        boolean tendenciaDeAlta = false;
        int inicioTendencia = -1;
        int fimTendencia = -1;

        for (int i = 0; i < precos.length - 1; i++) {
            // Se o preço do dia seguinte for maior que o do dia atual, continua a tendência de alta
            if (precos[i] < precos[i + 1]) {
                if (inicioTendencia == -1) {
                    inicioTendencia = i;  // Marcar o início da tendência de alta
                }
                fimTendencia = i + 1;  // Atualiza o fim da tendência
            } else {
                // Se a sequência de alta for maior que 3 dias, considera uma tendência de alta
                if (fimTendencia - inicioTendencia >= 3) {
                    tendenciaDeAlta = true;
                    break;  // Encontrou uma tendência de alta e para
                }
                // Reiniciar a tendência de alta:
                inicioTendencia = -1;
                fimTendencia = -1;
            }
        }

        // Verificar no final se houve uma tendência de alta até o último dia
        if (fimTendencia - inicioTendencia >= 3) {
            tendenciaDeAlta = true;
        }

        // Exibir resultado
        if (tendenciaDeAlta) {
            System.out.println("Há uma tendência de alta nos dias: ");
            for (int i = inicioTendencia; i <= fimTendencia; i++) {
                System.out.println("Dia " + (i + 1));
            }
        } else {
            System.out.println("Sem tendência de alta.");
        }

        scanner.close();
    }
}
