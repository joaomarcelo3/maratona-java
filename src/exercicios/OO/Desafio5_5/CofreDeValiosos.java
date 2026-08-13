package exercicios.OO.Desafio5_5;

public class CofreDeValiosos< T extends Valioso> extends Cofre<T> {

    public double valorTotal(){
        double total = 0;
        for (T item : listar()) {
            total +=  item.getValor();
        }
        return total;
    }




}
