package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {

    public static void main(String[] args) {

        // Declaração de uma set de Strings
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("Pão de forma");
        lista.add("Ovos");
        lista.add("Queijo");
        lista.add("Presunto");
        lista.add("Frutas");
        lista.add("Frutas");   // Não é uma duplicata, porque hà dois objetos String com o mesmo conteúdo
        String itemDaLista = "Café";
        lista.add(itemDaLista);
        lista.add(itemDaLista);   // Isto é uma duplicata


        System.out.println("--------------1º-------------");

        // iteração usando for each
        for(String item : lista){
            System.out.println(item);
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

