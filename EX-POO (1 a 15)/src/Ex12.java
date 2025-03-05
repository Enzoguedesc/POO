/*
12) Ler dois números inteiros (a e b) e imprimir os pares no intervalo a..b, além
da soma e da média desses números. Caso a seja maior que b, imprima os
números no intervalo b..a.
*/


import  java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Primeiro numero inteiro (a): ");
        int a = teclado.nextInt();

        System.out.print("Segundo numero inteiro (b): ");
        int b = teclado.nextInt();


        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);



        System.out.println("Números pares no intervalo " + inicio + " a " + fim + ": ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        double soma = a + b;
        double media = soma/2;

        System.out.println("Soma de a e b: " + soma);
        System.out.println("A média de a e b: " + media);

    }
}

