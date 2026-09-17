package exercicios.ListaDeExercicios.Streams.Ex12;

public class Ninja {
    String nome;
    String aldeia;
    int poder;

    public Ninja(String nome, String aldeia, int poder) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", poder=" + poder +
                '}';
    }
}
