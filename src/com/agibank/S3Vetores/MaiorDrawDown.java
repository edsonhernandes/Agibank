package com.agibank.S3Vetores;

        /*
        10. Cálculo do Maior Drawdown
        O drawdown representa a maior queda percentual de um ativo em relação ao seu pico anterior.
        Crie um programa que receba um vetor com os preços de fechamento de uma ação durante 10 dias e calcule
        o maior drawdown ocorrido nesse período.
        A fórmula para calcular o drawdown diário é:
        Drawdown = ((Preç o Atual − Pico Máximo Anterior) / Pico Máximo Anterior)  × 100
        O maior drawdown é o menor valor encontrado ao longo do período.
        Entrada de Exemplo:
        Preços: {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0, 103.0}
        Saída Esperada:
        Maior Drawdown: -13.64%
        Obs.: A maior queda ocorreu do pico de 110.0 para 95.0
        */

public class MaiorDrawDown {

    public static void main(String[] args) {
        // Vetor com os preços de fechamento da ação durante 10 dias
        double[] precos = {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0, 103.0};

        // Variáveis para calcular o maior drawdown
        double picoMaximo = precos[0];
        double maiorDrawdown = 0;

        // Loop para calcular o drawdown diário e o maior drawdown
        for (int i = 1; i < precos.length; i++) {
            // Calcular o drawdown
            double drawdown = ((precos[i] - picoMaximo) / picoMaximo) * 100;

            // Verificar se o drawdown atual é maior que o maior drawdown encontrado até agora
            if (drawdown < maiorDrawdown) {
                maiorDrawdown = drawdown;
            }

            // Atualizar o pico máximo, se necessário
            if (precos[i] > picoMaximo) {
                picoMaximo = precos[i];
            }
        }

        // Exibir o maior drawdown encontrado com duas casas decimais e o pico máximo
        System.out.printf("Maior Drawdown: %.2f%%\n", maiorDrawdown);
        System.out.println("O pico máximo encontrado foi:" + picoMaximo);
    }
}
