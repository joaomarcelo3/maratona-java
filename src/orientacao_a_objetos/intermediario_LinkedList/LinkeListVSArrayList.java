package orientacao_a_objetos.intermediario_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkeListVSArrayList {
    public static void main(String[] args) {
        /*Comparação entre ArrayList e LinkedList buscar, remover, adicionar, etc..*/

        long inicio;
        long fim;
        long tempo;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        //ArrayList
        inicio = System.nanoTime();
        arrayList.remove(250);

        fim = System.nanoTime();
        tempo  = fim - inicio;
        System.out.println("Tempo ArrayList: " + tempo + " ns");

        //LinkedList
        inicio = System.nanoTime();
        linkedList.remove(250);
        fim = System.nanoTime();
        tempo  = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + " ns");


    }
}
