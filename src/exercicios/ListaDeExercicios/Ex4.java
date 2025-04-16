package exercicios.ListaDeExercicios;
//4 - Faça um algoritmo que receba um número inteiro 
//e imprima na tela o seu antecessor e o seu sucessor.

public class Ex4 {
    public static void main(String[] args) {

        int numero = 10 ;
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Número passado " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        
    }
}
