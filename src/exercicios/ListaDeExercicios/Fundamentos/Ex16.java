package exercicios.fundamentos;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 3;
        int tentativa = 0 ;
        String usuario = "xuam";
        int senha = 1234;


        while (tentativa != NUMERO_MAX){

            System.out.println("Digite seu usuario");
            String tentativaUsuario = scanner.next();


            System.out.println("Digite sua senha");
            int tentativaSenha = scanner.nextInt();

            tentativa++;

            if (!tentativaUsuario.equals(usuario)){
                System.out.println("login ta errado");
            }
            if (tentativaSenha != senha) {
                System.out.println("senha incorreta");
            } if (tentativaUsuario.equals(usuario) && tentativaSenha == senha) {
                System.out.println("ta tudo certo");
                break;
            }


            if (tentativa == NUMERO_MAX){
                System.out.println("vc erro dms parceiro");
                break;
            }
        }


    }
}
