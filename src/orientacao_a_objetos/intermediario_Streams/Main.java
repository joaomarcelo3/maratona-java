package orientacao_a_objetos.intermediario_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 22));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 39));
        ninjas.add(new Ninja("Temari", "Suna", 67));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 12));

        //.stream - assim temos acesso a biblioteca streams

        //Listando todos os ninjas de konoha COM Streams usando filtragem - FILTER
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::println);

        System.out.println("");

        // Ordenacao por idade - SORTED
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::print);

        System.out.println("");

        // Ordecacao por nome - SORTED
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::print);

        System.out.println("");

        // Mostrar e mapear um atributo - MAP
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        // Filtrar por ninjas mais velho - MAX
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.print("Ninjas mais velho" + ninjaMaisVelho);


    }
}
