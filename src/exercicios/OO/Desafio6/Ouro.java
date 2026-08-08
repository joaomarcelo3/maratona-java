package exercicios.OO.Desafio6;

public class Ouro implements Valioso{
    private double valor;

    public Ouro(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Ouro " + "Valor: R$"+ getValor();
    }
}
