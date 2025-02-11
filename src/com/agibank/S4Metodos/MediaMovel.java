package com.agibank.S4Metodos;
/*
Implemente um método chamado calcularMediaMovel () que recebe um array de preços de uma ação e um
intervalo de tempo n. O método deve calcular a média móvel para o intervalo dado.
Entrada:
Preços: {100.0, 102.0, 101.0, 103.0, 105.0}
Intervalo: 3
Saída:
Média móvel: 101.0, 102,0, 103,0
 */

public class MediaMovel {

//    Criação do método:
    public static void calcularMediaMovel(double[] precos, int intervalo) {
        // Verificar se o intervalo é válido
        if (intervalo <= 0 || intervalo > precos.length) {
            System.out.println("Intervalo inválido.");
            return;
        }

        // Calcular a média móvel para cada índice válido
        for (int i = 0; i <= precos.length - intervalo; i++) {
            double soma = 0;

            // Somar os preços dentro do intervalo
            for (int j = i; j < i + intervalo; j++) {
                soma += precos[j];
            }

            // Calcular a média
            double media = soma / intervalo;

            // Exibir a média móvel
            System.out.print(media);
            if (i < precos.length - intervalo) {
                System.out.print(", ");
            }
        }
    }

//    Método main:
    public static void main(String[] args) {
        // Exemplo de uso
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 3;

        System.out.print("A média móvel do intervalo é: ");
        calcularMediaMovel(precos, intervalo);
    }
}
