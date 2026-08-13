package exercicios.OO.Desafio5_5;

public class Joia implements Valioso{

    private double valor;

    public Joia(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Joia " + "Valor: R$"+ getValor();
    }
}
