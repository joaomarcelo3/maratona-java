package orientacao_a_objetos.introducao_Records;

public record NinjaRecord(String nome, String email, int telefone) {

    /*RECORDS
    todos os atributos são FINAL por padrão
    não tem SETTER
    * */

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
