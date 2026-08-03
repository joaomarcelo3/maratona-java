package exercicios.OO.Desafio5;

public class Uzumaki extends Ninja{

    EnumBiju bijus;

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank, EnumBiju bijus) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
        this.bijus = bijus;
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Habilidade especial do clã uzumaki é ar! ");
    }

    @Override
    public String toString() {
        return "Ninja: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Aldeia: " + getAldeia() + "\n" +
                "Numero de Missões: " + getNumeroDeMissoes() + "\n" +
                "Rank: " + getRank() + "\n" +
                "Biju: " + bijus;
    }
}
