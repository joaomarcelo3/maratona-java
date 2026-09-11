package exercicios.ListaDeExercicios.Streams.Ex7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Ordene esse map pela nota, da maior pra menor, e guarde o resultado
        * num LinkedHashMap<String, Double>. Depois imprima.
        */

        Map<String, Double> notas = Map.of(
                "Matemática", 7.5,
                "Português", 9.0,
                "Física", 6.0,
                "História", 8.5
        );

        LinkedHashMap<String, Double> notasOrd = notas.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        System.out.println(notasOrd);
    }
}
