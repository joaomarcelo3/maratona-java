package orientacao_a_objetos.introducao_Metodos.test;

import orientacao_a_objetos.introducao_Metodos.dominio.Calculadora;

class CalculadoraTest01 {
    public static void main(String[] args) {
    
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoiNumeros(5,6);
    }
}