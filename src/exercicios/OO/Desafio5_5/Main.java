package exercicios.OO.Desafio5_5;

public class Main {
    public static void main(String[] args) {

    Cofre<String> cofre = new Cofre<>();
    cofre.guardar("Anel");
    cofre.guardar("Colar");
        System.out.println(cofre.listar());
    CofreDeValiosos<Joia> valiosos = new CofreDeValiosos<>();
    valiosos.guardar(new Joia(15000));
    valiosos.guardar(new Joia(25000));
        System.out.println(valiosos.listar());
        System.out.println(valiosos.valorTotal());
        
    }
}
