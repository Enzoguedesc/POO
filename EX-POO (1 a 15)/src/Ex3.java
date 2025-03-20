/*
3) Leia o salário e o percentual de aumento. Em seguida, aplique o
percentual de aumento sobre o salário e imprima o novo salário.
*/

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Salário: ");
        float x = teclado.nextFloat();

        System.out.print("Percentual de aumento (%): ");
        float aumento = teclado.nextFloat();

        float percentual = (aumento + 100)/100;

        float NovoSalario =  x * percentual;

        System.out.println("Aumento de " + aumento + " %");

        System.out.println("Novo salário: " + NovoSalario);

    }
}