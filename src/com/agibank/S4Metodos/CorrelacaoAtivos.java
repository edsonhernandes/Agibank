package com.agibank.S4Metodos;
/*
Crie um método chamado calcularCorrelacao() que recebe duas séries de preços de ativos e calcula a
correlação entre elas. A fórmula da correlação é:
Cor = Cov(X,Y) / &X•oY
Série 1: {100.0, 102.0, 104.0, 106.0}
Série 2: {50.0, 51.0, 52.0, 53.0}
Saída:
Correlação: 1.0
 */

public class CorrelacaoAtivos {

    // Método para calcular a correlação entre duas séries
    public static double calcularCorrelacao(double[] serie1, double[] serie2) {
        // Verificar se as séries têm o mesmo tamanho
//        if (serie1.length != serie2.length) {
//            throw new IllegalArgumentException("As séries devem ter o mesmo tamanho.");
//        }

        // Calcular a média de cada série
        double media1 = calcularMedia(serie1);
        double media2 = calcularMedia(serie2);

        // Calcular a covariância entre as duas séries
        double covariancia = 0.0;
        for (int i = 0; i < serie1.length; i++) {
            covariancia += (serie1[i] - media1) * (serie2[i] - media2);
        }
        covariancia /= serie1.length;

        // Calcular os desvios padrões de cada série
        double desvioPadrao1 = calcularDesvioPadrao(serie1, media1);
        double desvioPadrao2 = calcularDesvioPadrao(serie2, media2);

        // Calcular a correlação
        return covariancia / (desvioPadrao1 * desvioPadrao2);
    }

    // Método para calcular a média de uma série
    private static double calcularMedia(double[] serie) {
        double soma = 0.0;
        for (double valor : serie) {
            soma += valor;
        }
        return soma / serie.length;
    }

    // Método para calcular o desvio padrão de uma série
    private static double calcularDesvioPadrao(double[] serie, double media) {
        double somaQuadrados = 0.0;
        for (double valor : serie) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        return Math.sqrt(somaQuadrados / serie.length);
    }

    public static void main(String[] args) {
        // Exemplo de séries de preços
        double[] serie1 = {100.0, 102.0, 104.0, 106.0};
        double[] serie2 = {50.0, 51.0, 52.0, 53.0};

        // Calcular a correlação
        double correlacao = calcularCorrelacao(serie1, serie2);

        // Exibir o resultado
        System.out.printf("Correlação: %.1f\n", correlacao);

    }
}

