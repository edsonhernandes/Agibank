package com.agibank.S4Metodos;

/*
Implemente um método chamado calcular JurosSimples() que recebe o capital inicial,
a taxa de juros anual (%) e o tempo (em anos).O método deve retornar o montante final após o período.
Entrada:
Capital: 1000.0, Taxa: 5.0%, Anos: 3
Saída:
Montante final: 1150.0
 */

public class JurosSimples {

    // Método para calcular o montante com juros simples
    public static double calcularJurosSimples(double capital, double taxaJuros, int anos) {
        // Fórmula do juros simples: M = C * (1 + i * t)
        // M: Montante final
        // C: Capital inicial
        // i: Taxa de juros anual (em decimal)
        // t: Tempo em anos
        double montanteFinal = capital * (1 + (taxaJuros / 100) * anos);
        return montanteFinal;
    }

    public static void main(String[] args) {
        // Uso do método no main conforme dados do exercício:
        double capitalInicial = 1000.0;
        double taxaJuros = 5.0;
        int tempoAnos = 3;

//        Criação de uma varíavel montante que chama o método calcularJurosSimples
        double montante = calcularJurosSimples(capitalInicial, taxaJuros, tempoAnos);

        System.out.println("Montante final: " + montante);
    }
}
