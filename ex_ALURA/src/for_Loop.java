import java.util.Scanner;

public class for_Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {  // O i vai ate o 3 (3 notas).  Dessa maneira, serão 3 notas: o i com valor 0, 1 e 2.
            System.out.println("Digite sua avaliacao do  filme ");
            nota = teclado.nextDouble();
            mediaAvaliacao += nota;    // isso é igual a (mediaAvaliacao = mediaAvaliacao + nota)
        }
        System.out.println("Média de avaliacoes: " + mediaAvaliacao/3);

    }
}
