package orientacao_a_objetos.introducao_Generics.exemplo_COM_Generics.Parte_2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    //Inicializar nosso Array GENÉRICO -> T
    private List<T> ferramentas;

    //Construtor
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramento no nosso Array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostar a nossa lista de ferramentas
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

}
