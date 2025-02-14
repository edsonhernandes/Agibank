package com.agibank.S3Matrizes.Maratona;
/*
1. Sistema de Simulação de Previdência Privada:
Os participantes devem desenvolver um simulador de previdência privada que permita ao
usuário calcular sua aposentadoria com base nas seguintes informações de entrada:
Idade atual
Contribuição mensal
Taxa de juros anual esperada
Idade desejada para aposentadoria
O programa deve utilizar vetores e matrizes para armazenar e processar os dados.
O cálculo da taxa de juros mensal pode ser feito com a fórmula:
taxaJurosMensal = (1 + taxaJurosAnual / 100)^(1/12) - 1.
 */

import java.util.Scanner;

public class SimuladorPrevidenciaPrivada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Coleta de dados do usuário
        System.out.print("Digite a sua idade atual: ");
        int idadeAtual = scan.nextInt();

        System.out.print("Digite a sua contribuição mensal: ");
        double contribuicaoMensal = scan.nextDouble();

        System.out.print("Digite a taxa de juros anual esperada (em %): ");
        double taxaJurosAnual = scan.nextDouble();

        System.out.print("Digite a idade desejada para aposentadoria: ");
        int idadeAposentadoria = scan.nextInt();

        // Calculo da quantidade de anos até a aposentadoria
        int anosDeContribuicao = idadeAposentadoria - idadeAtual;
        if (anosDeContribuicao <= 0) {
            System.out.println("A idade de aposentadoria deve ser maior que a idade atual.");
            return;
        }

        // Criando um vetor para armazenar o saldo acumulado a cada mês
        int mesesDeContribuicao = anosDeContribuicao * 12;
        double[] saldos = new double[mesesDeContribuicao];

        // Convertendo taxa de juros anual para mensal
//        double taxaJurosMensal = Math.pow(1 + taxaJurosAnual / 100, 1.0 / 12.0) - 1;
        double taxaJurosMensal = (taxaJurosAnual/100)/12;


        // Variáveis para controle do saldo e cálculo
        double saldoAcumulado = 0;

        // Preenchendo o vetor com os saldos acumulados
        for (int i = 0; i < mesesDeContribuicao; i++) {
            // Atualiza o saldo com o juros mensal
            saldoAcumulado += contribuicaoMensal;
            saldoAcumulado *= (1 + taxaJurosMensal);

            // Armazena o saldo de cada mês no vetor
            saldos[i] = saldoAcumulado;
        }

        // Exibindo o saldo final após o último mês de contribuição
        System.out.printf("Saldo final acumulado após %d anos: R$ %.2f\n", anosDeContribuicao, saldos[mesesDeContribuicao - 1]);

        // Caso o usuário queira visualizar o saldo a cada ano
        System.out.println("\nSaldos ao longo dos anos de contribuição:");
        for (int i = 0; i < anosDeContribuicao; i++) {
            int mesInicio = i * 12;
            int mesFim = (i + 1) * 12 - 1;
            System.out.printf("Ano %d: R$ %.2f\n", i + 1, saldos[mesFim]);
        }

        scan.close();
    }
}

