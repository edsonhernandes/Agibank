package com.agibank.S3Vetores;

//Receba os valores de ações de um ativo referente a 5 dias de negociação. Calcule o crescimento percentual
// acumulado em 5 dias. Considere -> crescimento diário = ((valor atual - valor anterior) / Valor anterior)

public class CrescimentoPercentual {
    public static void main(String[] args) {

        double[] valores = {15,20,20,25,20};

        // Calculo do crescimento percentual acumulado
        double crescimentoAcumulado = 1.0; // Começa com 1, pois multiplicamos o acumulador

        for (int i = 1; i < 5; i++) {
            double crescimentoDiario = (valores[i] - valores[i - 1]) / valores[i - 1];
            crescimentoAcumulado = crescimentoAcumulado*(1 + crescimentoDiario);
        }

        // Calculo do percentual de crescimento final
        double crescimentoPercentual = (crescimentoAcumulado - 1) * 100;

        System.out.printf("Crescimento percentual acumulado em 5 dias: %.2f\n", crescimentoPercentual);
    }
}
