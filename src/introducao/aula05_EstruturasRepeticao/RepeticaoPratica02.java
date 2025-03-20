package introducao.aula05_EstruturasRepeticao;

/*
 Prática

 Dado um valor de um carro, descubara em quantas vezes ele pode ser parcelado
 Condição valorParcela >= 1000
 */


public class RepeticaoPratica02 {
    public static void main(String[] args) {
        
        double valorTotal = 30000;

        
    
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.printf("pagar em %d parcela(s) de R$ %.2f\n",parcela, valorParcela);            
        }

        System.out.println("*******************************************");

        for (int parcela = (int)valorTotal; parcela >=1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }

            System.out.printf("pagar em %d parcela(s) de R$ %.2f\n",parcela, valorParcela);            
        }
    }    
}
