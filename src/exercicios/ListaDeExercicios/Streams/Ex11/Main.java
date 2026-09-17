package exercicios.ListaDeExercicios.Streams.Ex11;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = List.of(
                new Ninja("Naruto", 950),
                new Ninja("Sasuke", 920),
                new Ninja("Sakura", 700),
                new Ninja("Kakashi", 890),
                new Ninja("Gaara", 850)
        );
        int poderTotal = ninjas.stream()
                .filter(ninja -> ninja.poder >= 800)
                .map(ninja -> ninja.poder)
                .reduce(0, (total, poder) -> total + poder);
                /*reduce é um acumulador. pega todos os valores
                de uma stream e transforma em um único valor*/

        System.out.println(poderTotal);


    }
}
