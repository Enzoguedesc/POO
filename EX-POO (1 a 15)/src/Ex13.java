/*
13) Ler um número de alunos n. Em seguida, ler as notas dos n alunos e
imprimir, ao final, a média da turma.
*/

import  java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.print("Número de alunos: ");
            int x = teclado.nextInt();


        double SomaNota = 0;


        for (int i = 1; i <= x; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = teclado.nextDouble();
            SomaNota += nota;
        }


        double media = SomaNota / x;
        System.out.println("Média da turma: " + media);


        }
    }
