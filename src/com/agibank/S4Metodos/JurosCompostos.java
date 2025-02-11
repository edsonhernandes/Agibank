package com.agibank.S4Metodos;
/*
Implemente um método chamado calcular JurosCompostos) que calcula o montante final de um investimento
com juros compostos, dado o capital inicial, a taxa de juros mensal e o número de meses.
Entrada:
Capital: 1000.0
Taxa: 0.02
Meses: 12
Saída:
Montante final: 1268.24
 */

public class JurosCompostos {

    // Método que calcula o montante final com juros compostos
    public static double calcularJurosCompostos(double capital, double taxa, int meses) {
        // Fórmula dos juros compostos: M = C * (1 + i)^n
        double montante = capital * Math.pow(1 + taxa, meses);
        return montante;
    }

//    Criação do método main:
    public static void main(String[] args) {
        // Exemplo de uso do método
        double capital = 1000.0;  // Capital inicial
        double taxa = 0.02;       // Taxa de juros mensal
        int meses = 12;           // Número de meses

        // Calcula o montante final chamando o método calcularJurosCompostos
        double montanteFinal = calcularJurosCompostos(capital, taxa, meses);

        // Exibe o resultado
        System.out.printf("O montante final é : %.2f\n", montanteFinal);
    }
}

