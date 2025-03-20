/*
8) Leia duas variáveis com a quantidade de kilowatts consumidos em uma
casa e o valor do kilowatt. Em seguida, calcule o valor a ser pago,
concedendo um desconto de 10% caso o consumo seja menor que 150Kw.
*/

import javax.swing.*;
import java.util.Scanner;

public class Ex8 {
    public static void main(String [] args) {
        /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade consumida de Kw:");
        double QuantidadeKw = teclado.nextDouble();

        System.out.print("Valor do Kw:");
        double ValorKw = teclado.nextDouble();

        double valorTotal = QuantidadeKw * ValorKw;

        if (QuantidadeKw < 150) {
            valorTotal *= 0.9;
        }

        System.out.printf("Valor a ser pago: R$ %.2f \n", valorTotal);

         */

        double quantidadeKW = Double.parseDouble(JOptionPane.showInputDialog("Quantidade consumida de Kw"));
        double valorKW = Double.parseDouble(JOptionPane.showInputDialog("Valor do Kw"));

        double valorTotal = quantidadeKW * valorKW;

        if (quantidadeKW < 150){
            valorTotal *= 0.9;
        }

        JOptionPane.showMessageDialog(null, "Valor a ser pago " + valorTotal);

    }
}