/*
14) Ler notas de alunos até que o usuário digite -1. Ao final imprimir a
quantidade de alunos, a média da turma, a maior nota e a menor nota.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de alunos: ");
        int x = teclado.nextInt();


        double SomaNota = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;


        for (int i = 1; i <= x; i++) {
            System.out.print("Digite a nota do aluno " + i + " (ou -1 para encerrar): ");
            double nota = teclado.nextDouble();
            SomaNota += nota;

            if (nota == -1) {
                break;
            }

        if (nota > maiorNota) {
                maiorNota = nota;
            }
        if (nota < menorNota) {
                menorNota = nota;
            }

        }
        System.out.println("Quantidade de alunos: " + x);

        double media = SomaNota / x;
        System.out.println("Média da turma: " + media);

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

         */

        int x = Integer.parseInt(JOptionPane.showInputDialog("Número de alunos"));

        double SomaNota = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= x; i++){
            Double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + i + " (ou -1 para encerrar): "));

            SomaNota += nota;

            if (nota == -1) {
                break;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        double media = SomaNota / x;

        JOptionPane.showMessageDialog(null, "Quantidade de alunos: " + x +
                "\nMédia da turma: " + media +
                "\nMaior nota: " + maiorNota +
                "\nMenor nota: " + menorNota);
    }

}
