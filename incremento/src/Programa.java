public class Programa {
    public static void main(String[] args) {

        int i, j, k;

        i = 10; // i = 11 e depois é 12
        j = i++;  // j recebe i primeiro, depois i é incrementado. Como i++ é um pós-incremento, o valor de i (10) é primeiro atribuído a j, e só depois i é incrementado para 11.
        k = ++i;  // 1 + 11 = 12

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}
