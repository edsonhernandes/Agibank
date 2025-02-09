package com.agibank.S3Vetores;

public class TendAltaAcoes {
    public static void main(String[] args) {

        double[] valorAcao = {10, 9, 8, 9, 7, 6, 7, 8, 3, 10};
        boolean tendenciaAlta = false;

        for (int i = 0; i < 8; i++) {
            if (valorAcao[i] < valorAcao[i + 1] && valorAcao[i + 1] < valorAcao[i + 2]) {
                System.out.println("Tendência de alta encontrada nos índices: " + i);
                tendenciaAlta = true;
            }
        }
        if (!tendenciaAlta) {
            System.out.println("Sem tendência de alta");
        }
    }
}
