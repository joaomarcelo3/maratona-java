package exercicios.fundamentos;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("                JOGO DA FORCA              ");
        System.out.println("===========================================");

        System.out.println("Jogador 1 - digite a palavra secreta: ");
        String palavra = scanner.nextLine();
        String underLine = "";

        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        for (int i = 0; i < palavra.length(); i++) {
            underLine += "_";
        }


        int tentativa = 0;
        while (tentativa < 6) {

            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0);

            boolean resultado = palavra.contains(String.valueOf(letra));
            if (resultado) {
                System.out.println("A letra '" + letra + "' pertence a palavra. ");
            }else {
                System.out.println("A letra nao pertence a palavra");

                tentativa++;
                System.out.println("Erro: " + tentativa + "/6");
            }

            if (tentativa == 6 ){
                System.out.println("Voce perdeu!");
                System.out.println("A palavra certa era: " + palavra);
            }

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    underLine = underLine.substring(0, i) + letra + underLine.substring(i + 1);
                }
            }

            if (!underLine.contains("_")){
                System.out.println("Parabens voce venceu!");
                System.out.println("Palavra: " + palavra);
                tentativa = 6;
            } else {
                System.out.println("Palavra: " + underLine);
            }

        }

    }
}
