/*
7) Leia uma variável n inteira. Em seguida, imprima uma mensagem
informando se o número n é par ou ímpar.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex7 {
    public static void main(String [] args) {
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um nº inteiro: ");
        int n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.printf("%d é par \n", n);
        }

        else {
            System.out.printf("%d é impar \n", n);
        }
        */

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº inteiro"));

        if(n % 2 == 0){
            JOptionPane.showMessageDialog(null, n + " é par");
        }
        else {
            JOptionPane.showMessageDialog(null, n + " é impar");
        }
    }
}