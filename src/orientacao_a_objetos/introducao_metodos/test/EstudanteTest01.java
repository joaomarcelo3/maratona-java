package orientacao_a_objetos.introducao_metodos.test;

import orientacao_a_objetos.introducao_metodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        
    Estudante estudante1 = new Estudante();
    Estudante estudante2 =  new Estudante();


    estudante1.nome = "Midoriya";
    estudante1.idade = 15;
    estudante1.sexo = 'M';

    estudante2.nome = "Sakura";
    estudante2.idade = 16;
    estudante2.sexo = 'F';

    estudante1.imprime();
    estudante2.imprime();

    }
}
