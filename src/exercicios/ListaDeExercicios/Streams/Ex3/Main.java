package exercicios.ListaDeExercicios.Streams.Ex3;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*Soma e estatísticas
        Dada a lista List<Integer> numeros = List.of(4, 8, 15, 16, 23, 42);
        calcule a soma, a média e o maior valor usando Streams
        */

        List<Integer> numeros = List.of(4, 8, 15, 16, 23, 42);
        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(numero -> numero.intValue())
                .summaryStatistics();

        System.out.println("Soma: " + stats.getSum());
        System.out.println("Média: " + stats.getAverage());
        System.out.println("Maior valor: " + stats.getMax());
    }
}
