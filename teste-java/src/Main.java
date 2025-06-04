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

        System.out.println("-----------");

        // Comparação de Strings
        String senha = "123";
        if (senha.equals("123")) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
        }

        System.out.println("-----------");

        // text blockº
        String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.println(mensagem);
    }
}