package orientacao_a_objetos.introducao_enum;

public class Missoes {

    private String nome;
    private RankMissoes rank;

    //Metodo para mostrar mais informações
    public void exibirDetalhes(){
        System.out.println("\nMissão: " + nome + "\nRank: " + rank.getDescricao() + "\nDificuldade: " +  rank.getDificuldade() );

    }

    public Missoes(String nome, RankMissoes rak) {
        this.nome = nome;
        this.rank = rak;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankMissoes getRak() {
        return rank;
    }

    public void setRak(RankMissoes rak) {
        this.rank = rak;
    }
}
