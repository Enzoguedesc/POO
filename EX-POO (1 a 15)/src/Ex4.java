/*
4) Leia o raio de um círculo. Em seguida imprima o perímetro (2*PI*R) e a
área (PI*R^2) do círculo com esse raio.
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o raio do Círculo: ");
        double R = teclado.nextDouble();

        double perimetro = (2 * Math.PI * R);

        double area = Math.PI * (Math.pow(R, 2));

        System.out.printf("Perimetro: %.2f \n", perimetro);
        System.out.printf("Área: %.2f \n", area);
    }

}