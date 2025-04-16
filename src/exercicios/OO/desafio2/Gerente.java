package exercicios.OO.desafio2;

public class Gerente extends Funcionario implements Bonificavel{

    private double bonus;
    private double percentual;

    
    public Gerente(String nome, int idade, double salario){
        super(nome, idade, salario);  
    }

    @Override
    public void exibirDados() {
        
        System.out.printf("A partir do seu percentual de %.0f%% o gerente %s teve um aumento de %.2f de seu bonûs\n", percentual, nome, getBonus());
        super.exibirDados();
    }

    @Override
    public void calcularBonus(double percentual) {
        this.percentual = percentual;

        percentual = percentual/100;
        bonus = salario * percentual;
        
    }

    public double getBonus() {
        return bonus;
    }
}
