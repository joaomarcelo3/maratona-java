package exercicios.OO.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //TODO Iniciar uma linkedList com 7 ninjas
        LinkedList<Ninja> lista = new LinkedList<>();

        //TODO Adicionar os ninjas na minha lista inicial
        lista.offer(new Ninja("Naruto Uzumaki", 18, "Vila da Folha"));
        lista.offer(new Ninja("Sasuke Uchiha", 19, "Vila da Folha"));
        lista.offer(new Ninja("Sakura Haruno", 17, "Vila da Folha"));
        lista.offer(new Ninja("Gaara", 15, "Vila da Areia"));
        lista.offer(new Ninja("Killer Bee", 25, "Vila da Nuvem"));
        lista.offer(new Ninja("Onoki", 24, "Vila da Pedra"));
        lista.offer(new Ninja("Zabuza Momochi", 36, "Vila da Nuvem"));

        // TODO Listar os ninjas
        // Complexidade o(n) - percorrendo a lista um por um
        for (Ninja ninja : lista){
            System.out.print(ninja);
        }

        System.out.println(" ");

        // TODO Adicionar o ninja no início da lista
        //adicionar minato no header da lista
        lista.offerFirst(new Ninja("Minato Uzumaki", 36, "Vila da Folha"));

        // TODO Remover o ninja no inicio da lista
        //removeu o header
        lista.poll();

        // TODO Listar os ninjas
        System.out.println(lista);

        // TODO Procurar ninjas por indicie
        System.out.println(lista.get(4));

        System.out.println("--------------Lista Ordenada por tipo--------------");

        /*
        * Por fins didáticos. o que acontece nas linhas abaixos:
        * no trecho (Ninja::getNome) uma forma de referênciar o metodo da classe Ninja (Method Reference)
        * falamos para o java, que existe um metodo getNome dentro da classe Ninja.
        *
        * comparing, é um metodo estática da interface Comparator, ele diz qual é a regra.
        * pega a referência (Ninja::getNome) e constrói uma regra a partir dela
        *
        * sort, o metodo motor da linha do código, ele pega a regra de comparação construída
        * pelo comparing e executa na proprio lista que criamos*/

        lista.sort(Comparator.comparing(Ninja::getNome));
        System.out.println("Lista por nome em ordem alfabética: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Ninja::getIdade));
        System.out.println("\nLista por idade: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Ninja::getVila));
        System.out.println("\nLista por Vila: ");
        System.out.println(lista);

    }
}
