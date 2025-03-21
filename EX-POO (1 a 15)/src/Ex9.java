/*
9) Ler um número real x e imprimi-lo arredondando seu valor para mais
ou para menos. Se a parte decimal for menor que 0.5 arredonda para
menos. Se for maior ou igual a 0.5 arredonda para mais.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex9 {
    public static void main(String [] args) {
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double x = teclado.nextDouble();

        int inteiro = (int) x;
        double decimal = x - inteiro;

        int arredondado;
        if (decimal < 0.5) {
            arredondado = inteiro;
        } else {
            arredondado = inteiro + 1;
        }

        System.out.println("Número arredondado: " + arredondado);

         */

        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real"));
        int inteiro = (int) x;
        double decimal = x - inteiro;

        int arredondado;
        if (decimal < 0.5){
            arredondado = inteiro;
        }
        else {
            arredondado = inteiro + 1;
        }
        JOptionPane.showMessageDialog(null, "Número arredondado " + arredondado);
        }

    }
