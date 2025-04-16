package exercicios.ListaDeExercicios;
//5 - Faça um algoritmo que leia o valor do salário mínimo 
//e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

public class Ex5 {
    public static void main(String[] args) {

        double salarioMinimo = 1293.20;
        double salarioUsuario = 1500;
        double total = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha aproximadamente: %.2f salários mínimos", total);


        
    }
}
