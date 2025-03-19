package introducao.aula05_EstruturasRepeticao;

/*
 * Prática
 * 
 * Imprima todos os números pares de 0 até 1000000
 * 
 */

public class RepeticaoPratica {
    public static void main(String[] args) {

        
        System.out.println("Números pares de 0 até 1000000");
        for(int i = 0; i <= 1000000; i++){
            if (i %2 == 0) {
                System.out.println(i);
                
            }
        }
        
    }    
}
