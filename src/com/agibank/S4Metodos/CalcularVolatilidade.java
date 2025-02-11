package com.agibank.S4Metodos;
/*
Implemente um método chamado calcularVolatilidade() que recebe um array de retornos diários de uma ação
e retorna o desvio padrão dos retornos.
Entrada:
Retornos: (0.01, 0.02, -0.01, 0.03, -0.02}
Saída:
Volatilidade: 0.018
 */

public class CalcularVolatilidade {

//    Criação do método:
    public static double calcularVolatilidade(double[] retornos) {
        // Passo 1: Calcular a média dos retornos
        double soma = 0;
        for (double retorno : retornos) {
            soma += retorno;
        }
        double media = soma / retornos.length;

        // Passo 2: Calcular a soma dos quadrados das diferenças entre cada retorno e a média
        double somaQuadrados = 0;
        for (double retorno : retornos) {
            somaQuadrados += Math.pow(retorno - media, 2);
        }

        // Passo 3: Calcular o desvio padrão (volatilidade)
        double variancia = somaQuadrados / retornos.length;
        double volatilidade = Math.sqrt(variancia);

        return volatilidade;
    }

    public static void main(String[] args) {
        double[] retornos = {0.01, 0.02, -0.01, 0.03, -0.02};

        //Chamada do método:
        double volatilidade = calcularVolatilidade(retornos);
        System.out.printf("Volatilidade: %.4f\n", volatilidade);
    }
}
