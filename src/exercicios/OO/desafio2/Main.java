package exercicios.OO.desafio2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro", 10, 3000);
        Gerente gerente = new Gerente("João", 20, 5000);

        funcionario.exibirDados();
        
        gerente.calcularBonus(15);
        gerente.exibirDados();
        
    }
}
