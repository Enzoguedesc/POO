import java.util.Scanner;

public class Aula_1_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome1 = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome1, idade, valor));

        System.out.println("---------");


        String nome2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);

        double media = (2.3 + 5 + 10 + 7) / 4;

        int classificacao = (int) media;
        System.out.println(classificacao);

        String a = "Ola, ";
        String nome = "Maria ";
        int idade2 = 30;
        System.out.println(a + nome + idade2);


        System.out.println("-----------------------------------------");


        double celsius = 36.5;

        //System.out.println("Digite a temperatura em Celsius: ");
        //double celsius = teclado.nextInt();

        double Fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit".formatted(celsius, Fahrenheit));


        System.out.println("--------Imprimindo um inteiro nem casa decimal---------");


        // System.out.println("Digite a temperatura em Celsius: ");
        //double celsius2 = teclado.nextInt();

        double Fahrenheit2 = (int) (celsius * 1.8) + 32;
        System.out.println("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit".formatted(celsius, Fahrenheit2));


        System.out.println("---------1----------");

        double valor1 = 10.3;
        int valor2 = 20;

        int media2 = (int) (valor1 + valor2) / 2;
        System.out.println("A média é: " + media2);

        System.out.println("---------2----------");


        System.out.println("Digite uma Letra: ");
        char letra = teclado.next().charAt(0);

        System.out.println("Digite uma Palavra: ");
        String palavra = teclado.next();

        System.out.println("Olà, meu nome é %s e meu nome começa com %s".formatted(palavra, letra));

        System.out.println("--------3---------");

        double precoProduto = 10.3;
        int qtd = 5;

        double total = precoProduto * qtd;
        System.out.println("O total a pagar é de R$%.2f".formatted(total));

        System.out.println("-----------------");

        double precoOriginal = 100.0;
        double desconto = 10.0;

        double precoComDesconto = (desconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - precoComDesconto;

        System.out.println("Preço original: R$%.2f".formatted(precoOriginal));
        System.out.println("Desconto: %.2f%%".formatted(desconto));
        System.out.println("Preço final: R$%.2f".formatted(valorFinal));

    }
}
