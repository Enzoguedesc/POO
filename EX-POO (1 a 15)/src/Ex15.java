/*
15)Ler caracteres até que o usuário digite '.' (ponto). Ao final imprimir: a
quantidade de vogais, a quantidade de dígitos e a quantidade dos demais
caracteres.
*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Vogais = 0, Digitos = 0, outrosCaracteres = 0;

        System.out.println("Digite caracteres (ou digite '.' para encerrar):");

        while (true) {
            char caractere = teclado.next().charAt(0);

            if (caractere == '.') {
                break;
            }

            if (Character.isDigit(caractere)) {
                Digitos++;
            } else if ("AEIOUaeiou".indexOf(caractere) != -1) {
                Vogais++;
            } else {
                outrosCaracteres++;
            }

            System.out.println("Quantidades de vogais: " + Vogais);
            System.out.println("Quantidades de digitos: " + Digitos);
            System.out.println("Quantidades de outros caracteres: " + outrosCaracteres);
        }
    }
}