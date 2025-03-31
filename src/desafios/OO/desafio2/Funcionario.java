package desafios.OO.desafio2;

public class Funcionario {

    protected String nome;
    private int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario){

        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ salario);
        System.out.println("-------------------------");
    }

}
