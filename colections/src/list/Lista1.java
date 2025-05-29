package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista1 {

    // **Iteração** é uma passagem por cada item da lista varias vezes


    public static void main(String[] args) {
        // Declaração de uma lista de Strings

        List<String> lista = new ArrayList<String>();
        lista.add("Pão de forma");
        lista.add("Ovos");
        lista.add("Queijo");
        lista.add("Presunto");
        lista.add("Frutas");
        lista.add("Frutas");   // Não é uma duplicata, porque hà dois objetos String com o mesmo conteúdo
        String itemDaLista = "Café";
        lista.add(itemDaLista);
        lista.add(itemDaLista);   // Isto é uma duplicata

        System.out.println(lista.get(0));   // Pão de forma

        System.out.println("--------------1º-------------");

        // iteração usando for each
        for(String item : lista){
            System.out.println(item);
        }

        System.out.println("------------2º---------------");

        // iteração usando for each tradicional
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("------------3º---------------");

        // iteração usando forEach com expressão lambda
        lista.forEach(item -> System.out.println(item));

        System.out.println("-------------4º--------------");

        // iteração usando Interator
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
