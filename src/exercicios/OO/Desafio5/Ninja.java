package exercicios.OO.Desafio5;

public class Ninja {

    private String nome;
    private int idade;
    private String aldeia;
    private int numeroDeMissoes;
    private NivelNinja rank;

    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println("Correr rápido! ");
    }

    public void tacarKunai(){
        System.out.println("O Ninja tacou uma kunai!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }

    @Override
    public String toString() {
        return "Ninja: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Aldeia: " + aldeia + "\n" +
                "Numero de Missões: " + numeroDeMissoes + "\n" +
                "Rank: " + rank;
    }
}
