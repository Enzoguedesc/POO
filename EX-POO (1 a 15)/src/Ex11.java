/*
11) Ler um caractere op representando uma operação aritmética (+, -, *, /) e em seguida dois números reais a e b.
Imprimir a expressão matemática junto com o seu resultado no formato: a op b = resultado.
*/


import javax.swing.*;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma operação (+, -, *, /): ");
        char op = teclado.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = teclado.nextDouble();


        double resultado = 0;
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    teclado.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                teclado.close();
                return;
        }

        System.out.println(a + " " + op + " " + b + " = " + resultado);



    }
}