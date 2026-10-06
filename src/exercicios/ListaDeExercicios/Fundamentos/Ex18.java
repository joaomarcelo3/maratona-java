package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha:");
        String senha = scanner.next();

        boolean maiuculo = false;
        boolean minuculo = false;
        boolean numiru = false;

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);
            if (Character.isUpperCase(letra)) {
                maiuculo = true;
            }

            if (Character.isLowerCase(letra)) {
                minuculo = true;
            }

            if (Character.isDigit(letra)){
                numiru = true;
            }

        }

        if (maiuculo && minuculo && numiru){
            System.out.println("Senha valida");
        }else {
            System.out.println("Senha invalida");
        }
        if (senha.length() < 8) {
            System.out.println("A senha possui menos de 8 caracteres");
        }

        if (!maiuculo) {
            System.out.println("A senha nao possui letra maiuscula");
        }

        if (!minuculo){
            System.out.println("A senha nao possui letra minuscula");
        }

        if (!numiru){
            System.out.println("A senha nao possui numero");
        }






    }
}
