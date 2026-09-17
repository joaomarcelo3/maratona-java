package exercicios.ListaDeExercicios.Streams.Ex9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto", "Konoha", 950));
        ninjas.add(new Ninja("Sasuke", "Konoha", 920));
        ninjas.add(new Ninja("Gaara", "Suna", 850));
        ninjas.add(new Ninja("Itachi", "Konoha", 980));
        ninjas.add(new Ninja("Deidara", "Iwa", 780));

        List<String> ninjasKonoha = ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .filter(ninja -> ninja.getPoder() >= 850)
                .sorted(Comparator.comparing(Ninja::getPoder).reversed())
                .map(Ninja::getNome)
                .toList();
        System.out.println(ninjasKonoha);

    }
}
