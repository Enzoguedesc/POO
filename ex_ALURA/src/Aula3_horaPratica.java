import java.util.Scanner;

public class Aula3_horaPratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ex1
        System.out.println("Digite um numero: ");
        double x = teclado.nextDouble();
        if (x >= 0) {
            System.out.println("Número Positivo");
        }else
            System.out.println("Número negativo");

        // ex2
        System.out.println("Insira dois números inteiros");

        System.out.println("número 1: ");
        int n1 = teclado.nextInt();

        System.out.println("número 2: ");
        int n2 = teclado.nextInt();

        if(n1 == n2){
            System.out.println("São iguais!");
        }
        if(n1 != n2){
            if (n1 > n2){
                System.out.println("São diferentes, o primeiro é maior");
            }else {
                System.out.println("São diferentes, o segundo é maior");
            }
        }

        // ex3
        
    }
}
