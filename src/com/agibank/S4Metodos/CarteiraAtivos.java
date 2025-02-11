package com.agibank.S4Metodos;
/*
Crie um método chamado simularCarteira() que recebe um array com os valores iniciais de 3 ativos financeiros
e os retornos médios esperados para cada ativo. O método deve calcular o valor final da carteira após 1 ano.
Entrada:
Valores iniciais: {1000.0, 2000.0, 1500.0}
Retornos: {0.05, 0.03, 0.04}
Saída:
Valor final da carteira: 4825.0 , porém com essas entradas a saída foi 4670,00
 */

public class CarteiraAtivos {

    //Criação do método
    public static double simularCarteira(double[] valoresIniciais, double[] retornos) {
        double valorFinal = 0.0;

        // Verifica se os arrays de valores iniciais e retornos têm o mesmo tamanho
        if (valoresIniciais.length != retornos.length) {
            System.out.println("Erro: Os arrays devem ter o mesmo tamanho.");
            return -1;
        }

        // Calcula o valor final da carteira após 1 ano
        for (int i = 0; i < valoresIniciais.length; i++) {
            valorFinal += valoresIniciais[i] * (1 + retornos[i]);
        }

        return valorFinal;
    }

//    Criação do método main
    public static void main(String[] args) {
        double[] valoresIniciais = {1000.0, 2000.0, 1500.0};
        double[] retornos = {0.05, 0.03, 0.04};

//        Chamada do método simularCarteira:
        double valorFinal = simularCarteira(valoresIniciais, retornos);

        // Exibe o valor final da carteira
        System.out.printf("Valor final da carteira: %.2f\n", valorFinal);
    }
}

