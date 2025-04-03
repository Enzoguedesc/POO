import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o 1º nº: ");
        int x = teclado.nextInt();

        System.out.println("Digite o 2º nº: ");
        int y = teclado.nextInt();

        int soma = x + y;
        int subtraçao = x - y;
        int multiplicaçao = x * y;
        int divisao = x / y;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtraçao: " + subtraçao);
        System.out.println("Resultado da multiplicaçao: " + multiplicaçao);
        System.out.println("Resultado da divisao: " + divisao);

    }
}