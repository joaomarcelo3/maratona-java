package exercicios.fundamentos;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        /*Faça um algoritmo que solicite ao usuário uma palavra e mostre a palavra original e a palavra
    invertida. Posteriormente, verifique se a palavra é um palíndromo, ou seja, se pode ser lida
    da mesma forma da esquerda para a direita e da direita para a esquerda.
    Exemplo 1:
    Digite uma palavra: radar
    Palavra original: radar
    Palavra invertida: radar
    É um palíndromo? Sim
    Exemplo 2:
    Digite uma palavra: java
    Palavra original: java
    Palavra invertida: avaj
    É um palíndromo? Não*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.println("Palavra Original: " + palavra);
        String palavraInvertida = "";

        for (int i = palavra.length() -1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("Palavra invertida:" + palavraInvertida);

        if (palavra.equals(palavraInvertida)){
            System.out.println("A Palavra e um Polindromo");
        }else {
            System.out.println("A Palavra nao eh Polindromo");
        }


    }
}
