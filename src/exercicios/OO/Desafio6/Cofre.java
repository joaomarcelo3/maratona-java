package exercicios.OO.Desafio6;

import java.util.ArrayList;
import java.util.List;

public class Cofre <T>{
    private List<T> itens;

    public Cofre() {
        this.itens = new ArrayList<>();
    }

    public void guardar(T item){
        itens.add(item);
    }

    public void retirar(int index){ itens.remove(index);
    }

    public void listar(){
        System.out.println("Itens no cofre = " + itens);
    }


}