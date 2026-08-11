package orientacao_a_objetos.introducao_Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@gmail.com", 99998888);
        System.out.println(cadastro);

        NinjaRecord cadastroUsandoRecords = new NinjaRecord("Sasuke", "sasuke@gmail.com", 1111111);
        System.out.println(cadastroUsandoRecords);
        System.out.println(cadastroUsandoRecords.emailCaixaAlta());
        System.out.println(cadastroUsandoRecords.nome());
    }
}
