package exercicios.fundamentos;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario = "";
        int tentativa = 0;
        int valido = 0;
        int invalido = 0;

        while (!usuario.equals("fim")){
            tentativa++;
            System.out.println("Digite um nome de usuario");
            usuario = scanner.nextLine();

            String letra = usuario.replaceAll("[^abcdefghijklmnopqrstuvwxyz]", "");

            if (usuario.length() >= 5){
                if (usuario.startsWith(letra)){
                    System.out.println(tentativa + " - " + usuario + " usuario valido");
                    valido++;

                }else {
                    System.out.println( tentativa + " - " + usuario + " tem mais de 5 caracteres, porem nao comeca com uma letra");
                    invalido++;
                }
            } else {
                System.out.println( tentativa + " - " + usuario + " tem menos de 5 caracteres");
                invalido++;
            }

        }
        System.out.println("Usuario informados: " + (tentativa - 1));
        System.out.println("Usuario validos: " + valido);
        System.out.println("Usuario invalidos: " + (invalido - 1));

    }
}
