package exercicios.ListaDeExercicios;
//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida 
//imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Ex1 {
    public static void main(String[] args){

        int a = 10;
        int b = 10;
        int c = 19;

        System.out.println("A = " + a + " B = " + b + " C = " + c);

        if (a + b > c) {
            System.out.println("A soma entre A + B é maior que C");            
        }if (a + b < c) {
            System.out.println("A soma entre A + B é menor que C");
            
        }
    }
}
