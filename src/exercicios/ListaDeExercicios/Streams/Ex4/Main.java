package exercicios.ListaDeExercicios.Streams.Ex4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*Objetivo: agrupar os produtos por categoria, retornando um Map<String, List<Produto>>.
        Algumas dicas antes de você tentar:

        Pra agrupar, existe um Collector pronto chamado Collectors.groupingBy(...), que substitui o Collectors.toList() que você já usou no exercício 1.
        Ele precisa saber por qual critério agrupar — nesse caso, a categoria de cada produto.
        Assim como no filter, você vai passar uma lambda dizendo "pega o produto e me dá a categoria dele".*/
        record Produto(String nome, String categoria, double preco) {}

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos", 3500.0),
                new Produto("Mouse", "Eletrônicos", 50.0),
                new Produto("Camiseta", "Roupas", 40.0),
                new Produto("Calça", "Roupas", 120.0)
        );

        Map<String, List<Produto>> categoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::categoria));

        System.out.println(categoria);
    }
}
