package exercicios.ListaDeExercicios.Streams.Ex5;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Objetivo:
        Agrupar os produtos por categoria .
        Calcular o preço médio de cada categoria → resultado deve ser Map<String, Double>.
        Ordenar esse resultado do maior preço médio pro menor.*/

        record Produto(String nome, String categoria, double preco) {}

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos", 3500.0),
                new Produto("Mouse", "Eletrônicos", 50.0),
                new Produto("Camiseta", "Roupas", 40.0),
                new Produto("Banana", "Comida", 4),
                new Produto("Maçã", "Comida", 2),
                new Produto("Uva", "Comida", 5),
                new Produto("Laranja", "Comida", 1)
        );

        /*Agrupar os produtos por categoria
        Calcular o preço médio de cada categoria → resultado deve ser Map<String, Double>.*/
        Map<String, Double> grupos = produtos.stream()
                .collect(Collectors.groupingBy(Produto::categoria, Collectors.averagingDouble(Produto::preco)));
        System.out.println(grupos);

        LinkedHashMap<String, Double> gruposOrd = grupos.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        System.out.println(gruposOrd);



    }
}
