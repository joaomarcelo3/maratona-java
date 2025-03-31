package orientacao_a_objetos.introducao_metodos.test;

import orientacao_a_objetos.introducao_metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
    }
}
