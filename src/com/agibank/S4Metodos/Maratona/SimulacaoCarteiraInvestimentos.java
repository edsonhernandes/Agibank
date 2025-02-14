package com.agibank.S4Metodos.Maratona;
/*
Simulação de Carteira de Investimentos: Um investidor acompanha sua carteira de ações diariamente.
Ele deseja um programa que registre os preços de N ativos financeiros ao longo de M dias e permita
operações de consulta e análise dos investimentos.
Não precisa realizar as entradas. A tabela abaixo simula preços diários das ações.
Use os dados da tabela na matriz como entrada em hardcode.

Ativo   PETR4    VALE3    ITUB4

Día 1   22,5     85,0     30,0

Dia 2   23,0     86,5     29,5

Dia 3   22,0     84,0     30,5

Dia 4   24,5     83,5     31,0

Dia 5   25,0     87,0     32,5

Funcionalidades implementadas com métodos:
(20) Média de preços: Para um ativo específico, calcule a média de preços ao longo dos dias.
(20) Maior valorização: Identificar o ativo que teve a maior variação positiva no período.
(20) Simulação de lucro/perda: Comparar o primeiro e o último dia de cada ativo para indicar se houve lucro
ou prejuízo.
(20) Consulta de preço: Permitir que o usuário escolha um ativo e um dia e visualize o preço correspondente.

Tratamento de exceções:
(20) Usar uma captura de exceção a sua escolha.

Saída prevista:
Média de preços do ativo PETR4 → 23.4
Ativo com maior valorização → PETR4 (de 22.5 para 25.0, crescimento de 11.11%)
Lucro/Perda de cada ativo:
PETR4: Lucro (11,11%)
VALE3: Lucro (2,35)
ITUB4: Lucro (8,33)
Consulta do preço do ativo VALE3 no dia 3 → 84.0 */
import java.util.Scanner;

public class SimulacaoCarteiraInvestimentos{
    static String[] ativos = {"PETR4", "VALE3", "ITUB4"};
    static double[][] precos = {
            {22.5, 23.0, 22.0, 24.5, 25.0},
            {85.0, 86.5, 84.0, 83.5, 87.0},
            {30.0, 29.5, 30.5, 31.0, 32.5}
    };

    public static double calcularMedia(int indexAtivo) {
        double soma = 0;
        for (double preco : precos[indexAtivo]) {
            soma += preco;
        }
        return soma / precos[indexAtivo].length;
    }

    public static String maiorValorizacao() {
        double maiorCrescimento = 0;
        String ativoMaiorCrescimento = "";
        for (int i = 0; i < ativos.length; i++) {
            double crescimento = ((precos[i][4] - precos[i][0]) / precos[i][0]) * 100;
            if (crescimento > maiorCrescimento) {
                maiorCrescimento = crescimento;
                ativoMaiorCrescimento = ativos[i];
            }
        }
        try {
            return ativoMaiorCrescimento + " (de " + precos[getIndex(ativoMaiorCrescimento)][0] + " para "
                    + precos[getIndex(ativoMaiorCrescimento)][4] + ", crescimento de "
                    + String.format("%.2f", maiorCrescimento) + "%)";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ativoMaiorCrescimento;
    }

    public static void calcularLucroPerda() {
        System.out.println("Lucro/Perda de cada ativo:");
        for (int i = 0; i < ativos.length; i++) {
            double crescimento = ((precos[i][4] - precos[i][0]) / precos[i][0]) * 100;
            System.out.println(ativos[i] + ": " + (crescimento >= 0 ? "Lucro" : "Prejuízo") + " ("
                    + String.format("%.2f", crescimento) + "%)");
        }
    }

    public static double consultarPreco(String ativo, int dia) throws Exception {
        int indexAtivo = getIndex(ativo);
        if (dia < 1 || dia > 5) {
            throw new Exception("Dia inválido! Escolha um dia entre 1 e 5.");
        }
        return precos[indexAtivo][dia - 1];
    }

    private static int getIndex(String ativo) throws Exception {
        for (int i = 0; i < ativos.length; i++) {
            if (ativos[i].equals(ativo)) {
                return i;
            }
        }
        throw new Exception("Ativo não encontrado!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Média de preços do ativo PETR4 → " + String.format("%.2f", calcularMedia(0)));
            System.out.println("Ativo com maior valorização → " + maiorValorizacao());
            calcularLucroPerda();

            System.out.print("Digite o ativo para consulta de preço: ");
            String ativo = scan.next().toUpperCase();
            System.out.print("Digite o dia (1-5): ");
            int dia = scan.nextInt();
            System.out.println("Consulta do preço do ativo " + ativo + " no dia " + dia + " → " + consultarPreco(ativo, dia));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scan.close();
    }
}
