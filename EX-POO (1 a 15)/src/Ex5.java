/*
5) Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex5 {
    public static void main(String [] args) {
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int t = teclado.nextInt();

        int hora = t / 3600;
        int resto = t % 3600;
        int min = resto / 60;
        int seg = resto % 60;

        System.out.printf("%d seg = %d h %d min %d seg \n", t, hora, min, seg);
         */

        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em segundos."));

        int hora = tempo / 3600;
        int resto = tempo % 3600;
        int min = resto / 60;
        int seg = resto % 60;

        JOptionPane.showMessageDialog(null, tempo + " seg = " + hora + " horas " + min + " min " + seg + " seg ");

    }
}
