import java.util.Random;
import java.util.Scanner;

public class Aula3_jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int tentativas = 5; tentativas > 0; tentativas--) {
            System.out.println("Número de tentativas " + tentativas);

            System.out.println("Qual será o numero? ");
            int numero = teclado.nextInt();

            int numAleatorio = new Random().nextInt(100);
            System.out.println(numAleatorio);

            if(tentativas == 1){
                System.out.println("Fim!");
                break;
            }
            if(numero == numAleatorio){
                System.out.println("Parabéns, você acertou o número!");
            }
        }
    }
}
