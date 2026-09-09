package exercicios.ListaDeExercicios.Streams.Ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Transformação com map
        Dada a lista List<String> nomes = List.of("joão", "maria", "pedro", "ana");,
        use Streams para retornar uma lista com os nomes convertidos para maiúsculas.
        */

        List<String> nomes = List.of("joão", "maria", "pedro", "ana");
        List<String> convertidos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(convertidos);
    }
}
