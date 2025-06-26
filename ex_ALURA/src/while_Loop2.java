import java.util.Scanner;

public class while_Loop2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {  // Para encerrar o loop é so digitar -1, para isso, a nota tem que ser diferente de -1
            System.out.println("Digite sua avaliacao do filme ou -1 para encerrar ");
            nota = teclado.nextDouble();

            if (nota != -1) {  // Se a nota realmente for diferente de -1, o codigo vai executar isso
                mediaAvaliacao += nota;
                totalNotas++;  // A cada nota que eu digitar ele vai incrementar nesta variavel
            }
        }
        System.out.println("Média de avaliacoes: " + mediaAvaliacao/totalNotas);


        // EX

        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;  // Dessa maneira, a cada iteração do loop, o valor de 'contador' será atualizado,
            // permitindo que os números de 1 a 10 sejam impressos corretamente.
        }

        // OU

        for (int contador2 = 1; contador2 <= 10; contador2++) {
            System.out.println(contador2);
        }

    }
}

