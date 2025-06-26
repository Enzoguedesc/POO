import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = teclado.nextInt();

        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terca-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia Inválido";
                break;
        }

        System.out.println("O dia " + dia + ", é " + nomeDia);
    }
}
