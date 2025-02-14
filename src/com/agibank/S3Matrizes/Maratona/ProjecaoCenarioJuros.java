package com.agibank.S3Matrizes.Maratona;
/*
2. Projeção com Diferentes Cenários de Juros:
Para simular diferentes taxas de juros ao longo do tempo, utilizamos uma matriz, onde:
As linhas representam diferentes cenários de taxa de juros (ex.: 4%, 6%, 8%, 10%)
As colunas representam os anos de contribuição
Cada célula da matriz armazena o saldo acumulado para um determinado ano e taxa de juros.
Exemplo de cálculo dentro da matriz(Chamei de saldo acumulado): Matriz[i][j] = P x ((1 + ri)(j+1)×12 − 1) / ri
Onde:
ri é a taxa de juros do cenário i
j representa os anos até a aposentadoria
 */

import java.util.Scanner;

public class ProjecaoCenarioJuros {

    public static void main(String[] args) {

        // Entrada dos dados
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da contribuição mensal: ");
        double aporteMensal = scan.nextDouble(); // valor inicial

        System.out.print("Qual o número de cenários de taxa de juros: ");
        int numCenarios = scan.nextInt(); // número de cenários de taxa de juros

        System.out.print("Digite o número de anos de contribuição: ");
        int anosContrib = scan.nextInt(); // número de anos

        // Matriz para armazenar o saldo acumulado
        double[][] saldoAcumulado = new double[numCenarios][anosContrib];

        // Solicitando as taxas de juros
        double[] taxasDeJuros = new double[numCenarios];
        for (int i = 0; i < numCenarios; i++) {
            System.out.print("Digite a taxa de juros para o cenário " + (i + 1) + " : ");
            taxasDeJuros[i] = scan.nextDouble()/100;
        }

        // Calculo do saldo acumulado para cada cenário e ano
        for (int i = 0; i < numCenarios; i++) {
            for (int j = 0; j < anosContrib; j++) {
                // Fórmula para calcular o saldo acumulado
                double ri = taxasDeJuros[i];
                int anosContribuicao = j + 1; // j começa em 0, então +1 para representar o ano correto
                saldoAcumulado[i][j] = aporteMensal * (Math.pow((1 + ri), (anosContribuicao * 12)) - 1) / ri;
            }
        }

        // Exibindo os resultados
        System.out.println("\nProjeção de saldos acumulados:");

        System.out.print("Ano\t");
        for (int i = 0; i < numCenarios; i++) {
            System.out.print("Cenário " + (i + 1) + "\t");
        }
        System.out.println();

        for (int j = 0; j < anosContrib; j++) {
            System.out.print((j + 1) + "\t");
            for (int i = 0; i < numCenarios; i++) {
                System.out.print(String.format("%.2f", saldoAcumulado[i][j]) + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}
