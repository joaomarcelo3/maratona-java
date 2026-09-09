package exercicios.ListaDeExercicios.Streams.Ex1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Filtrar e coletar
        * Dada a lista List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);,
        * use Streams para retornar uma nova lista contendo apenas os números pares.
        */

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);



        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);


    }
}
