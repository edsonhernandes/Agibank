package com.agibank.S4Metodos;
/*
Faça em java um metodo estatico chamado ConverterMoeda( ) que recebe um valor em (R$) e uma taxa de conversão
 para dólares (USD) e retorna o valor convertido.
 Entrada Valor em R$ 100,0 | taxa de conversão 4,90 | saída 100,0 reais equivalem a 20,41 dólares
 */

public class ConversaoMoeda {

    // Método estático para conversão de R$ para USD
    public static double ConverterMoeda(double valorReais, double taxaConversao) {
            return (valorReais / taxaConversao);
    }

    public static void main(String[] args) {
        // Entrada dos valores
        double valorReais = 120.0;
        double taxaConversao = 4.90;

        // Chamando o método para converter
        double valorConvertido = ConverterMoeda(valorReais, taxaConversao);

        // Exibindo o resultado
        System.out.printf("%.2f reais equivalem a %.2f dólares\n", valorReais, valorConvertido);
    }
}
