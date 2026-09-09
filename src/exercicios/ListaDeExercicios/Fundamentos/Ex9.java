package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*Faça um algoritmo que simule um login simples. O sistema deve pedir que o usuário digite um
        nome de usuário e uma senha. Considere como usuário correto "admin" e senha correta
        "1234".
        • Se os dois estiverem corretos, escreva em tela “Acesso permitido”;
        • Se apenas o usuário estiver incorreto, escreva “Usuário inválido”;
        • Se apenas a senha estiver incorreta, escreva “Senha incorreta”.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informa sua senha: ");
        String senha = scanner.nextLine();

        if (nome.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso permitido");
        } else if (!nome.equals("admin")) {
            System.out.println("Usuário inválido");
        } else if (!senha.equals("1234")) {
            System.out.println("Senha incorreta");
        }
    }
}
