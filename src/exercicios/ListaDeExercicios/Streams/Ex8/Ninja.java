package exercicios.ListaDeExercicios.Streams.Ex8;

public class Ninja {
    String nome;
    int idade;

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
