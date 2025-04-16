package exercicios.OO.desafio4;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade, double[] salarios){
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        if (salarios == null) {
            return;
        }
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario+ " ");
        }
    
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
            
        }
        media /= salarios.length;
        System.out.printf("\nMédia: %.2f ",media);
    }   
}
