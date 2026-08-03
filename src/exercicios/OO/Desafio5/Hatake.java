package exercicios.OO.Desafio5;

public class Hatake extends Ninja implements SharinganInterface{

    public Hatake(String nome, int idade, String aldeia, int numeroDeMissoes, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoes, rank);
    }

    /*
     * Método:
     * Implementa da interface Sharingan
     * */
    @Override
    public void sharinganAtivado() {
        System.out.println("O ninja " + getNome() + " do clã hatake ativou o sharingan! ");
    }

}
