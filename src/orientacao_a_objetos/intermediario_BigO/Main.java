package orientacao_a_objetos.intermediario_BigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        * A notação Big O é usada para descrever a eficiência de algoritmos em termos de tempo
        * de execução ou uso de espaço na memória, em função do tamanho da entrada.*/

        ArrayList<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", 17));
        ninjas.add(new Ninja("Sakura Haruno", 17));

        // Algoritimo - o(1) Complexidade Constante
        System.out.println(ninjas.get(2));

        System.out.println("");

        // Algoritimo - o(n) Complexidade Linear
        for (Ninja ninja : ninjas){
            System.out.println(ninja);
        }

        System.out.println("");

        // Algoritimo - o(n^2) Complexidade quadratica
        for (int i = 0; i < ninjas.size(); ++i) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + "vs" + ninjas.get(j));
            }
        }








    }
}
