package com.agibank.S3Vetores;

// Crie um programa que armazene em um vetor os valores futuros de um investimento de R$ 1.000,00
// aplicados em um juros compostos por 6 meses, com taxa de 2% ao mês.
//         A fórmula utilizada é:
//         Valor Futuro=Valor Inicial×(1+taxa)n
//         Onde n é o número de meses.
//         Saída Esperada: Valores futuros: {1020.00, 1040.40, 1061.21, 1082.43, 1104.08, 1126.16}

public class PrevisaoJurosCompostos {
    public static void main(String[] args) {
        double valorInicial = 1000.00;
        double taxa = 0.02;
        int meses = 6;

        // Criando um vetor para armazenar os valores futuros
        double[] valoresFuturos = new double[meses];

        // Calculando os valores futuros
        for (int i = 0; i < meses; i++) {
            valoresFuturos[i] = valorInicial * Math.pow(1 + taxa, i + 1);
        }

        // Exibindo os valores futuros
        System.out.print("Os valores futuros são: {");
        for (int i = 0; i < meses; i++) {
            System.out.printf("%.2f", valoresFuturos[i]);
            if (i < meses - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
