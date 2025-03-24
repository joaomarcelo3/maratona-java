package orientacao_a_objetos.introducao_metodos.test;

import orientacao_a_objetos.introducao_metodos.dominio.CalculadoraAvancada;

public class CalculadoraAvancadaTest {
    public static void main(String[] args) {
        CalculadoraAvancada calculadora = new CalculadoraAvancada();
        calculadora.exibirMensagem();
        System.out.println(calculadora.subtrair(5, 4));
    }
}
