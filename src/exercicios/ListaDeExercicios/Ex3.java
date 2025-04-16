package exercicios.ListaDeExercicios;
//3 - Faça um algoritmo que leia dois valores inteiros A e B, 
//se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos
//cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

public class Ex3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int c;

        if (a == b) {
            c = a + b;
            System.out.println("Soma dos valores: " + c);
        } else{
            c = a * b;
            System.out.println("Multiplicação dos valores: " + c );
        }
        
    }
}
