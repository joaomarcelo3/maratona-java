package orientacao_a_objetos.introducao_classes.test;

import orientacao_a_objetos.introducao_classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "DevDojo";
        professor.idade = 89;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome+" "+"Idade: "+professor.idade+" "+"Sexo: "+professor.sexo);
    }
}
