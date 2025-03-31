package orientacao_a_objetos.introducao_metodos.test;

import orientacao_a_objetos.introducao_metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {       
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest03");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }
}
