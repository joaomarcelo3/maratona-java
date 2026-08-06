package exercicios.OO.Desafio6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Cofre<Object> cofre = new Cofre<>();
        cofre.guardar(new Prata(4000));
        cofre.guardar(new Ouro(8000));
        cofre.guardar(new Joia(15000));
        cofre.listar();
        cofre.retirar(0);
        cofre.listar();

    }
}
