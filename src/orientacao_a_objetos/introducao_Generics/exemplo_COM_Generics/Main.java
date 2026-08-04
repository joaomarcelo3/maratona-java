package orientacao_a_objetos.introducao_Generics.exemplo_COM_Generics;

public class Main {
    public static void main(String[] args) {

        /*Generics
         * Deixar o código escalável
         * Facilitar manutenção
         * Código reutilizável e genérico
         * */

        //EXEMPLO SEM UTILIZAÇÃO DE GENERICS

        EquipamentosNinja kunai = new EquipamentosNinja("Kuani de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamentos(kunai);
        bolsaGenerica.addEquipamentos(shuriken);
        bolsaGenerica.addEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
