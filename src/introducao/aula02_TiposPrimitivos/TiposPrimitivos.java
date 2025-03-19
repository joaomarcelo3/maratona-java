package introducao.aula02_TiposPrimitivos;
/*
 * Prática
 * 
 * Crie variáveis para os campos descritos abaixo entre <>
 * e imprima a seguinta mensagem:
 * 
 * eu <nome>, morando no endereço <endereço>
 * confirmo que recebi o salário de <salario>, na data <data>
 */

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        String nome = "João";
        String endereco = "Av Brasil 123";
        String data = "18/03/2025";
        double salario = 3000.49 ;

        System.out.println("eu " +nome+", moro no endereço "+endereco+" confirmo" +
        " que recebi o salário de "+ salario+ ", na data " + data);

    }
    
}
