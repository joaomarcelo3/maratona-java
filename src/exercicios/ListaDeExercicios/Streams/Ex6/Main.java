package exercicios.ListaDeExercicios.Streams.Ex6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*ordenar do menor pro maior

        Ordene esse map pela idade, do menor pro maior, e imprima o resultado
        (pode devolver um LinkedHashMap ou só imprimir direto com .forEach).*/

        Map<String, Integer> idades = Map.of(
                "Ana", 25,
                "Bruno", 19,
                "Carla", 34
        );

        idades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);

        LinkedHashMap<String, Integer> idadeOrd = idades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b)-> a, LinkedHashMap::new));
        System.out.println(idadeOrd);

        System.out.println("Maior para o menor ");
        idades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        LinkedHashMap<String, Integer> idadeOrdI = idades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b)-> a, LinkedHashMap::new));
        System.out.println( "Maior para o menor "+ idadeOrdI);
    }
}
