package desafios.OO.desafio3;

public class ContaBancaria {

    private double saldo;
    
    public void depositar(double valor){

        saldo += valor;
        System.out.println("Depósito Concluído");
        consultarSaldo();
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -=valor;
        System.out.println("Saque Concluído");
        consultarSaldo();
        } else{
            System.out.println("Você não tem dinheiro suficiente!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: "+ saldo);
    }

    public double getSaldo() {
        return saldo;
    }

}
