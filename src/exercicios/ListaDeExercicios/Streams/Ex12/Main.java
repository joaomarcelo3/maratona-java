package exercicios.ListaDeExercicios.Streams.Ex12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = List.of(
                new Ninja("Naruto", "Konoha", 950),
                new Ninja("Sasuke", "Konoha", 920),
                new Ninja("Sakura", "Konoha", 700),
                new Ninja("Gaara", "Suna", 850),
                new Ninja("Temari", "Suna", 750),
                new Ninja("Itachi", "Konoha", 980),
                new Ninja("Deidara", "Iwa", 780),
                new Ninja("Kakashi", "Konoha", 890),
                new Ninja("Kurotsuchi", "Iwa", 820)
        );

        Map<String, List<Ninja>> ninjasMap = ninjas.stream()
                .collect(Collectors.groupingBy(ninja -> ninja.aldeia));
        System.out.println(ninjasMap);

        Optional<Ninja> ninjaMax = ninjas.stream()
                .filter(ninja -> ninja.aldeia.equals("Konoha"))
                .max((ninja1, ninja2) -> Integer.compare(ninja1.poder, ninja2.poder));
        System.out.println(ninjaMax);
    }
}
