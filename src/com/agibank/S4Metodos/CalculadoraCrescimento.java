package com.agibank.S4Metodos;
/*
Crie um método chamado calcularCrescimento() que recebe o preço de uma ação em dois dias consecutivos
e calcula a variação percentual.
Entrada:
Preço no dia 1: 100.0
Preço no dia 2: 105.0
Saída:
Crescimento: 5.0%
 */

public class CalculadoraCrescimento {

    public static void main(String[] args) {
        // Entrada de dados
        double precoDia1 = 100.0;
        double precoDia2 = 105.0;

        // Chama o método e imprime o resultado
        double crescimento = calcularCrescimento(precoDia1, precoDia2);
        System.out.println("O crescimento da ação no período foi: " + crescimento + "%");
    }
//        Criação do método:
    public static double calcularCrescimento(double precoDia1, double precoDia2) {
        double variacao = ((precoDia2 - precoDia1) / precoDia1) * 100;   // Calcula a variação percentual
        return variacao;
    }
}
