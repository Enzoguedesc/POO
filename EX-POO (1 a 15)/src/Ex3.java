/*
3) Leia o salário e o percentual de aumento. Em seguida, aplique o
percentual de aumento sobre o salário e imprima o novo salário.
*/

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Salário: ");
        int x = teclado.nextInt();

        System.out.print("Percentual de aumento: ");
        int y = teclado.nextInt();

        int percentual = (y + 100)/100;

        int NovoSalario =  x * percentual;

        System.out.println("Novo salário: " + NovoSalario);



    }
}