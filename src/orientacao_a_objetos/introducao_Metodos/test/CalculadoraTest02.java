package orientacao_a_objetos.introducao_Metodos.test;

import orientacao_a_objetos.introducao_Metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Divide método 1: "+calculadora.divideDoisNumeros(20, 2));
        System.out.println("Divide método 2: "+calculadora.divideDoisNumero2(8, 0));
        calculadora.divideDoisNumeros3(8, 0);

    }
}