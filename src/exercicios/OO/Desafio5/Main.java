package exercicios.OO.Desafio5;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------Naruto-------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 18,"Aldeia da folha",
                15, NivelNinja.CHUNIN, EnumBiju.KURAMA);
        System.out.println(naruto);
        naruto.habilidadeEspecial();
        System.out.println(naruto.bijus.ordinal());
        System.out.println(naruto.bijus.teste());

        System.out.println(" ");

        System.out.println("-------------------Sasuke-------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 18, "Aldeia da folha", 20, NivelNinja.CHUNIN);
        System.out.println(sasuke);
        sasuke.sharinganAtivado();
        sasuke.habilidadeEspecial();
    }
}
