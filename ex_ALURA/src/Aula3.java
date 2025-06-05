import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano do lançamento: ");
        int anoDeLancamento = teclado.nextInt();

        boolean incluidoNoPlano = true;
        String nome = "Aprendendo Java";
        double avaliacao = 9.8;

        if (anoDeLancamento > 2015){
            System.out.println("Esse livro é recente");
        }else {
            System.out.println("Esse livro é antigo");
        }

    }
}
