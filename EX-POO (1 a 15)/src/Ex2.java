/*
2) Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Variavel 1: ");
        float x = teclado.nextFloat();

        System.out.print("Variavel 2: ");
        float y = teclado.nextFloat();

        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x / y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


    }
}