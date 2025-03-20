public class Programa {
    public static void main(String[] args) {

        // int nao suporta um float, mas um float suporta um int

        float a = 5 * 4 / (float) 6 + 7;
        double b = 5 * 4.0 / 6 + 7;
        double c = 5 * 4 % 6 + 7;

        String nome1 = "Maria";
        String nome2 = nome1;
        nome1 = "Joao";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if(nome1.equals("Maria")){
            System.out.println("Ola, MAria");
        }else {
            System.out.println("Seja bem vindo");
        }

    }
}
