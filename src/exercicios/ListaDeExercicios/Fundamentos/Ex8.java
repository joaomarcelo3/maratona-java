package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

    /*Faça um algoritmo que peça ao usuário digitar um e-mail. O programa deve verificar se o texto
    digitado contém o caractere @ e termina com .com. Caso atenda a essas condições, escreva
    em tela “E-mail válido”. Caso contrário, escreva “E-mail inválido”.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa seu email: ");
        String email = scanner.nextLine();

        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Email válido");
        }else {
            System.out.println("Email inválido");
        }
    }
}
