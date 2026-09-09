package orientacao_a_objetos.intermediario_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temari", "Suna", 19));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

        //.stream - assim temos acesso a biblioteca streams

        //Listando todos os ninjas de konoha sem Streams

        List<Ninja> ninjaKonoha = new ArrayList<>();
        for (Ninja ninja : ninjas ){
            if (ninja.getVila().equals("Konoha")){
                ninjaKonoha.add(ninja);
            }
        }
        System.out.println(ninjaKonoha);

        System.out.println("=======================================");

        //Listando todos os ninjas de konoha COM Streams
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::print);

    }
}
