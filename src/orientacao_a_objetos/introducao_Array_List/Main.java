package orientacao_a_objetos.introducao_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] ninjasArray = new String[3];

        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //Printando todos os elementos do array;
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println((1+i) + " " + ninjasArray[i]);
        }

        /* Listas
        * Litas não são estáticas, elas podem aumentar de tamanho*/
        List<String> ninjasList = new ArrayList<>();

        //Adicionar na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        //Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        //Trocar elementos
        ninjasList.set(3, "Minato Uzumaki");
        System.out.println("ninjasList = " + ninjasList);

        //Ver o tamanho da lista
        System.out.println("Quantidade de elementos: " + ninjasList.size());

        //Printa o objeto pelo index da lista
        System.out.println(ninjasList.get(1));

        //Printa o primeiro elemento da lista
        System.out.println(ninjasList.getFirst());

        //Printa o último elemento da lista
        System.out.println(ninjasList.getLast());

    }
}
