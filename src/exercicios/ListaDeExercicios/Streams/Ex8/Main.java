package exercicios.ListaDeExercicios.Streams.Ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", 18));
        ninjas.add(new Ninja("Sasuke Uchiha", 17));
        ninjas.add(new Ninja("Sakura Haruno", 22));
        ninjas.add(new Ninja("Kakashi Hatake",30));
        ninjas.add(new Ninja("Gaara",  39));
        ninjas.add(new Ninja("Temari", 67));
        ninjas.add(new Ninja("Rock Lee", 12));

        List<String> ninjasMaior = ninjas.stream()
                .filter(ninja -> ninja.idade >= 18)
                .map(ninja -> ninja.nome)
                .toList();

        System.out.println(ninjasMaior);
    }
}
