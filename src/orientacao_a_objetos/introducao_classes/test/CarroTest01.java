package orientacao_a_objetos.introducao_classes.test;

import orientacao_a_objetos.introducao_classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca Bala";
        carro.modelo = "Sport";
        carro.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        System.out.println("Carro 1\n Nome: "+carro.nome+ " Modelo: "+carro.modelo+ " Ano: "+carro.ano);
        System.out.println("Carro 2\n Nome: "+carro2.nome+ " Modelo: "+carro2.modelo+ " Ano: "+carro2.ano);
    }
}
