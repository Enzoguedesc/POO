package list;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        int i = 1;
        float b = 2.5f;
        double d = 3.5;
        boolean bo = true;
        byte by = 127;   // so vai ate o 127
        byte by2 = -128;  // no minimo vai ser -128
        char c = 'a';

        // List
        int[] numeros = {20, 40, 60, 80, 100};
        System.out.println(numeros[1]);    // vai imprimir 40



        //ArrayList          // So pode usar se for classes wrapper (começa com letra maiuscula)
        // Classes Wrapper
        // Coleçoes so conseguem apontar para objetos

        Integer wrapper;
        Float wrapper2;
        Double wrapper3;
        String wrapper4;
        Boolean wrapper5;
        Byte wrapper6 = 127;
        // Nao existe classe wrapper para char
        ArrayList<Integer> nome = new ArrayList<Integer>();

        System.out.println(wrapper6);
    }
}
