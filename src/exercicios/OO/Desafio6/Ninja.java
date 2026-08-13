package exercicios.OO.Desafio6;

public class Ninja {

    private String nome;
    private int idade;
    private String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getVila() {
        return vila;
    }

    @Override
    public String toString() {
        return "\nNinja = " + nome + ", " + idade + " anos" + ", " +  vila;
    }
}
