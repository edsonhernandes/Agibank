package com.agibank.S4Metodos;
/*
Crie um método chamado compararAtivos() que recebe os retornos médios de dois ativos financeiros e
retorna o nome do ativo com maior retorno.
Entrada:
Ativo 1: 5.0%
Ativo 2: 4.5%
Saída:
O ativo com maior retorno é: Ativo 1
 */

public class ComparadorDeAtivos {

//    Criação do método:
    public static String compararAtivos(double retornoAtivo1, double retornoAtivo2) {
        if (retornoAtivo1 > retornoAtivo2) {
            return "O ativo com maior retorno é: Ativo 1";
        } else if (retornoAtivo1 < retornoAtivo2) {
            return "O ativo com maior retorno é: Ativo 2";
        } else {
            return "Os ativos possuem o mesmo retorno";
        }
    }

//    Criação do método main:
    public static void main(String[] args) {
        double retornoAtivo1 = 5.0;
        double retornoAtivo2 = 4.5;

        // Chama o método e imprime o resultado
        String resultado = compararAtivos(retornoAtivo1, retornoAtivo2);
        System.out.println(resultado);
    }
}
