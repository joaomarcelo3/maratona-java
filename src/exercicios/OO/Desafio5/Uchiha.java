package exercicios.OO.Desafio5;

public class Uchiha extends Ninja implements SharinganInterface{

    /*Construtor:
    * Herdado da classe Ninja
    * */

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    /*
    * Método:
    * Implementa da interface Sharingan
    * */
    @Override
    public void sharinganAtivado() {
        System.out.println("O ninja " + getNome() + " do clã uchiha ativou o sharingan! ");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Habilidade especial do clã uchiha é fogo! ");
    }

}
