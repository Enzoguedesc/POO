/*
1) Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e
divisão entre elas.
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Variavel 1: ");
        int x = teclado.nextInt();

        System.out.print("Variavel 2: ");
        int y = teclado.nextInt();

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        float divisao = (float) x / y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}