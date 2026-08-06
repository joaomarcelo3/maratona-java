package exercicios.OO.Desafio6;

public class Prata {
    private double valor;

    public Prata(double valor) {
        this.valor = valor ;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Prata " + "Valor: R$" + valor;
    }
}
