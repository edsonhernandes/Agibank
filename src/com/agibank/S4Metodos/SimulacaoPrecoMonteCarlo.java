package com.agibank.S4Metodos;
/*
Crie um método chamado simularPrecoMonteCarlo() que simula o preço de uma ação após n períodos (diários)
usando o modelo de caminhada aleatória (random.nextGaussian()) com drift. O método deve receber o preço inicial,
a média do retorno diário, a volatilidade e o número de períodos (em dias).
Entrada:
Modelo de caminhada aleatória com drift
Preço inicial: 100.0
P,-P, x eftox) Onde:
Média do retorno diário: 0.001
Volatilidade diária: 0.02
* P,é o preço da ação no tempo t.
Períodos: 10
* p é a média do retorno diário.
* o é a volatilidade diária.
Saída:
* Z é um número aleatório da distribuição normal (random.next Gaussian()).
Precos simulados：{100.0, 101.0, 99.8, 102.3, 100.5, ...}
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulacaoPrecoMonteCarlo {

    public static List<Double> simularPrecoMonteCarlo(double precoInicial, double mediaRetornoDiario, double volatilidadeDiaria, int periodos) {
        List<Double> precosSimulados = new ArrayList<>();
        Random random = new Random();

        // Adiciona o preço inicial à lista
        precosSimulados.add(precoInicial);

        // Simula o preço da ação para cada período
        for (int t = 1; t <= periodos; t++) {
            // Gera um número aleatório Z com distribuição normal
            double Z = random.nextGaussian();

            // Calcula o preço no próximo período usando o modelo de caminhada aleatória com drift
            double precoAtual = precosSimulados.get(t - 1);
            double novoPreco = precoAtual * Math.exp((mediaRetornoDiario - 0.5 * volatilidadeDiaria * volatilidadeDiaria) + volatilidadeDiaria * Z);

            // Adiciona o novo preço à lista
            precosSimulados.add(novoPreco);
        }

        return precosSimulados;
    }

    public static void main(String[] args) {
        // Parâmetros de entrada
        double precoInicial = 100.0;
        double mediaRetornoDiario = 0.001;
        double volatilidadeDiaria = 0.02;
        int periodos = 10;

        // Chama o método para simular os preços
        List<Double> precosSimulados = simularPrecoMonteCarlo(precoInicial, mediaRetornoDiario, volatilidadeDiaria, periodos);

        // Exibe os preços simulados
        System.out.println("Preços simulados:");
        for (double preco : precosSimulados) {
            System.out.println(String.format("%.2f", preco));
        }
    }
}

