package orientacao_a_objetos.introducao_Enum;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Regastar cachorro", RankMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankMissoes.A);
        missao2.exibirDetalhes();

    }
}
