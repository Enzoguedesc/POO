/*
10) Ler um número inteiro n e mais dois números (inferior e superior) que
formam um intervalo. Ao final, imprima uma mensagem informando
se n está antes, dentro ou depois do intervalo.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex10 {
    public static void main(String [] args) {
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = teclado.nextInt();

        System.out.print("Digite o limite inferior do intervalo: ");
        int inferior = teclado.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        int superior = teclado.nextInt();


        if (n < inferior) {
            System.out.println("O número está ANTES do intervalo.");
        } else if (n > superior) {
            System.out.println("O número está DEPOIS do intervalo.");
        } else {
            System.out.println("O número está DENTRO do intervalo.");
        }

         */

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        int inferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior do intervalo"));
        int superior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo"));

        if(n < inferior){
            JOptionPane.showMessageDialog(null, "O número esta ANTES do intervalo");
        } else if (n > superior){
            JOptionPane.showMessageDialog(null, "O número está DEPOIS do intervalo");
        }else {
            JOptionPane.showMessageDialog(null, "O número está DENTRO do intervalo");
        }

    }
}

