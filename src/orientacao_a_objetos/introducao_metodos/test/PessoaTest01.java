package orientacao_a_objetos.introducao_metodos.test;

import orientacao_a_objetos.introducao_metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
    }
    
}
