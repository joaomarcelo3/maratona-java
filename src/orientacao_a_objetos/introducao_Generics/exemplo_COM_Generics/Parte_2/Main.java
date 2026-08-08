package orientacao_a_objetos.introducao_Generics.exemplo_COM_Generics.Parte_2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Clone das sombras"));

        System.out.println("itens da nossa bolsa ninja");
        bolsaNinja.mostrarFerramenta();
    }
}
