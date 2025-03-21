/*
2) Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        /*
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

         */

        float x = Float.parseFloat(JOptionPane.showInputDialog("Variavel 1"));
        float y = Float.parseFloat(JOptionPane.showInputDialog("Variavel 2"));


        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x/y;

        JOptionPane.showMessageDialog(null, "Soma " + soma);
        JOptionPane.showMessageDialog(null, "Subtraçao " + subtracao);
        JOptionPane.showMessageDialog(null, "Multiplicaçao " + multiplicacao);
        JOptionPane.showMessageDialog(null, "Divisao " + divisao);



    }
}