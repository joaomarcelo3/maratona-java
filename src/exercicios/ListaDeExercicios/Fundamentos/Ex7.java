package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        /*Faça um algoritmo em que o usuário informe uma palavra. Posteriormente, crie uma condição
        para validar que se a palavra tiver mais que 20 caracteres, escrever no terminal que a “palavra
        é muito grande”. Caso contrário, informe que a “palavra é pequena”.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa uma palavra: ");
        String palavra = scanner.nextLine();

        if (palavra.length() > 20){
            System.out.println("Palavra muito grande!");
        } else {
            System.out.println("Palavra é pequena!");
        }
    }
}
