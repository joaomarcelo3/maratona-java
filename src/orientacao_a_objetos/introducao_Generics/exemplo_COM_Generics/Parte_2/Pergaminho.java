package orientacao_a_objetos.introducao_Generics.exemplo_COM_Generics.Parte_2;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
