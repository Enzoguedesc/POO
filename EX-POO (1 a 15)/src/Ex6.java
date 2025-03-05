/*
6) Leia a distância percorrida por um carro, o tempo gasto e a quantidade de
gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o
consumo de combustível (Km/l).
*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = teclado.nextDouble();

        System.out.print("Digite o tempo gasto (h): ");
        double tempo = teclado.nextDouble();

        System.out.print("Digite a quantidade de gasolina consumida (L): ");
        double gasolina = teclado.nextDouble();

        double VelocidadeMedia = distancia / tempo;
        double ConsumoCombustivel = distancia / gasolina;

        System.out.printf("Velocidade Média: %.2f Km/h \n", VelocidadeMedia);
        System.out.printf("Consumo de combustivel: %.2f Km/L \n", ConsumoCombustivel);

    }
}
