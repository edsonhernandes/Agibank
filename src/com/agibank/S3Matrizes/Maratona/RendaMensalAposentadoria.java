package com.agibank.S3Matrizes.Maratona;
/*
3. Cálculo da Renda Mensal na Aposentadoria
Após a aposentadoria, o saldo acumulado será convertido em uma renda mensal baseada em uma
retirada mensal fixa considerando uma expectativa de vida de m anos.
A fórmula para calcular a retirada mensal sustentável é: R = S × (r / (1 − ((1 + r) − m×12)

Onde:
R = Renda mensal
S = Saldo acumulado na aposentadoria
r = Taxa de juros mensal (r = taxa anual​ / 12)
m = Expectativa de vida após aposentadoria (anos)

O programa deve exibir:
Saldo acumulado no momento da aposentadoria
Renda mensal estimada para diferentes cenários de taxa de juros

Saída Esperada:

Simulação de Previdência Privada
Idade atual: 30 anos
Contribuição mensal: R$ 1.000,00
Taxa de juros anual esperada: 6%
Idade desejada para aposentadoria: 65 anos

Saldo final estimado:
- Com taxa de 4%: R$ 1.200.000,00
- Com taxa de 6%: R$ 1.500.000,00
- Com taxa de 8%: R$ 1.900.000,00

Renda mensal estimada para 20 anos de aposentadoria:
- Com taxa de 4%: R$ 5.800,00
- Com taxa de 6%: R$ 7.200,00
- Com taxa de 8%: R$ 9.000,00
 */

public class RendaMensalAposentadoria {
    public static void main(String[] args) {
        // Dados iniciais
        int idadeAtual = 30;
        double contribuicaoMensal = 1000.00;
        double taxaJurosAnualEsperada = 0.06; // Taxa de juros anual esperada (6%)
        int idadeDesejadaAposentadoria = 65;
        int expectativaVidaAposentadoria = 20; // Expectativa de vida após aposentadoria (20 anos)

        // Calcular o número de anos de contribuição
        int anosContribuicao = idadeDesejadaAposentadoria - idadeAtual;

        // Simulações de taxas de juros
        double[] taxasDeJuros = {0.04, 0.06, 0.08}; // 4%, 6% e 8% ao ano
        double[] saldosFinais = new double[taxasDeJuros.length];
        double[] rendasMensais = new double[taxasDeJuros.length];

        // Cálculo do saldo final para cada taxa de juros
        for (int i = 0; i < taxasDeJuros.length; i++) {
            double taxaJurosMensal = taxasDeJuros[i] / 12; // Convertendo para taxa mensal
            double saldoFinal = calcularSaldoFinal(contribuicaoMensal, taxaJurosMensal, anosContribuicao);
            saldosFinais[i] = saldoFinal;

            // Cálculo da renda mensal com o saldo final
            double rendaMensal = calcularRendaMensal(saldoFinal, taxaJurosMensal, expectativaVidaAposentadoria);
            rendasMensais[i] = rendaMensal;
        }

        // Exibição dos resultados
        System.out.println("Simulação de Previdência Privada\n");
        System.out.println("Idade atual: " + idadeAtual + " anos");
        System.out.println("Contribuição mensal: R$ " + String.format("%.2f", contribuicaoMensal));
        System.out.println("Taxa de juros anual esperada: " + (taxaJurosAnualEsperada * 100) + "%");
        System.out.println("Idade desejada para aposentadoria: " + idadeDesejadaAposentadoria + " anos\n");

        System.out.println("Saldo final estimado:");
        for (int i = 0; i < taxasDeJuros.length; i++) {
            System.out.println("- Com taxa de " + (taxasDeJuros[i] * 100) + "%: R$ " + String.format("%.2f", saldosFinais[i]));
        }

        System.out.println("\nRenda mensal estimada para " + expectativaVidaAposentadoria + " anos de aposentadoria:");
        for (int i = 0; i < taxasDeJuros.length; i++) {
            System.out.println("- Com taxa de " + (taxasDeJuros[i] * 100) + "%: R$ " + String.format("%.2f", rendasMensais[i]));
        }
    }

    // Método para calcular o saldo final acumulado após o período de contribuição
    public static double calcularSaldoFinal(double contribuicaoMensal, double taxaJurosMensal, int anosContribuicao) {
        double saldoFinal = 0.0;
        int mesesContribuicao = anosContribuicao * 12;

        // Cálculo do saldo final considerando as contribuições mensais e os juros compostos
        for (int i = 0; i < mesesContribuicao; i++) {
            saldoFinal = saldoFinal * (1 + taxaJurosMensal) + contribuicaoMensal;
        }

        return saldoFinal;
    }

    // Método para calcular a renda mensal baseada no saldo final e na expectativa de vida
    public static double calcularRendaMensal(double saldoFinal, double taxaJurosMensal, int expectativaVida) {
        // Usando a fórmula fornecida
        double mesesAposAposentadoria = expectativaVida * 12;
        double rendaMensal = saldoFinal * (taxaJurosMensal / (1 - Math.pow(1 + taxaJurosMensal, -mesesAposAposentadoria)));
        return rendaMensal;
    }
}
