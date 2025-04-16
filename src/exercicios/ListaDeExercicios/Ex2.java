package exercicios.ListaDeExercicios;
//2 - Faça um algoritmo para receber um número qualquer 
//e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Ex2 {
    public static void main(String[] args) {
     
        int numero = -11 ;

        if (numero < 0) {
        System.out.print(numero + " é negativo,");
            
        }if (numero >= 0) {
            System.out.print(numero + " é positivo,");

        }if (numero %2 == 0) {
            System.out.println(" e par.");
        }else{
                System.out.println(" e impar.");
            }
    }
}  