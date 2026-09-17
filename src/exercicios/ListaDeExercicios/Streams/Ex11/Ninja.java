package exercicios.ListaDeExercicios.Streams.Ex11;

public class Ninja {
    String nome;
    int poder;

    public Ninja(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                '}';
    }
}
