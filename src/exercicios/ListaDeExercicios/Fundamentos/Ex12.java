package exercicios.ListaDeExercicios.Fundamentos;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita a primeira palavra");
        String palavra1 = scanner.nextLine();

        System.out.println("Digita a segunda palavra");
        String palavra2 = scanner.nextLine();

        System.out.println("Digita a terceira palavra");
        String palavra3 = scanner.nextLine();

        if (palavra1.length() > palavra2.length() || palavra1.length() > palavra3.length()){
            System.out.println("A maior palavra é " + palavra1);
        } else if (palavra2.length() > palavra1.length() || palavra2.length() > palavra3.length()) {
            System.out.println("A maior palavra é " + palavra2);
        }

    }
}
