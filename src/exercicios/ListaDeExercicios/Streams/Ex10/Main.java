package exercicios.ListaDeExercicios.Streams.Ex10;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = List.of(
                "Naruto",
                "Sasuke",
                "Naruto",
                "Kakashi",
                "Sakura",
                "Sasuke",
                "Gaara",
                "Itachi",
                "Kakashi",
                "Madara"
        );

        List<String> ninjasValido = ninjas.stream()
                .distinct() //remove as Strings Duplicadas
                .sorted()//ordena em ordem alfabética
                .limit(5)//limita os 5 primeiros
                .toList();//converte para um List de Strings
        System.out.println(ninjasValido);


    }
}
