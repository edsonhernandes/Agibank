package com.agibank.S3Vetores;

public class TendenciaAlta {

    public static void main(String[] args) {
        // Preços diários das ações (10 dias)
        double[] precos = {10.5, 11.0, 12.0, 12.5, 12.0, 13.0, 13.5, 14.0, 14.5, 15.0};

        // Variáveis para verificar a tendência de alta
        int inicioTendencia = -1;
        int comprimentoTendencia = 0;

        // Iterar pelo vetor de preços para detectar a tendência de alta
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                // Se o preço atual for maior que o anterior, estamos em alta
                if (comprimentoTendencia == 0) {
                    inicioTendencia = i - 1; // Marca o início da tendência
                }
                comprimentoTendencia++;
            } else {
                // Se o preço não for maior, a tendência de alta é interrompida
                comprimentoTendencia = 0;
            }

            // Se encontrarmos uma tendência de alta de pelo menos 3 dias, mostramos os resultados
            if (comprimentoTendencia >= 3) {
                System.out.println("Tendência de alta detectada nos dias: ");
                for (int j = inicioTendencia; j <= i; j++) {
                    System.out.print(j + " ");
                }
                return; // Finaliza a execução após encontrar a tendência
            }
        }

        // Caso não tenha sido encontrada nenhuma tendência de alta
        System.out.println("Sem tendência de alta.");
    }
}

