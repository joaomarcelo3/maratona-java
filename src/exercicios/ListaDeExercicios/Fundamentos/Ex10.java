package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.println("Informa a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.equals(palavra2)){
            System.out.println("as palavras são iguais");
        }else {
            System.out.println("as palavras são diferentes");
        }

    }
}
