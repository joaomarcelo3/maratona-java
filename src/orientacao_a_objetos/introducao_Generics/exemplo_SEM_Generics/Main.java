package orientacao_a_objetos.introducao_Generics.exemplo_SEM_Generics;

public class Main {
    public static void main(String[] args) {

        //EXEMPLO SEM UTILIZAÇÃO DE GENERICS

        Kunai kunai = new Kunai("Kunai");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de água");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.addKunai(kunai);
        bolsaKunai.addKunai(kunai2);
        bolsaKunai.addKunai(kunai3);
        System.out.println(bolsaKunai);



    }
}
