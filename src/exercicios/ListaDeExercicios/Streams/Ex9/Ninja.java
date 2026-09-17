package exercicios.ListaDeExercicios.Streams.Ex9;

public class Ninja {
    private String nome;
    private String aldeia;
    private int poder;


    public Ninja(String nome, String aldeia, int poder) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getPoder() {
        return poder;
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
