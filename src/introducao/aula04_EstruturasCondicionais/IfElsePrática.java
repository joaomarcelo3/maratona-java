package introducao.aula04_EstruturasCondicionais;
/*
 * Prática
 * 
 * quanto de imposto eu preciso pagar na holando em 2025
 * baseado no meu salário anual.
 * 
 * 
 *  Income	            Tax rate
    up to €38,441	35.82% (was 36.97% in 2024)
    from €38,441 to €76,817	37.48% (was 36.97% in 2024)
    from €76,817	49.50% (same as 2024)
 * 
 */

public class IfElsePrática {
    public static void main(String[] args) {
        double salarioAnual = 68000;
        double primeiraFaixa = 35.82/100;
        double segundaFaixa = 38.48/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto = salarioAnual;

        System.out.printf("Salário anual: %.2f \n",salarioAnual);

        if (salarioAnual < 38441 ) {
            salarioAnual *= primeiraFaixa;
        }
        else if (salarioAnual >= 38441 && salarioAnual < 76817) {
            salarioAnual *= segundaFaixa;
            
        } else{
            salarioAnual *= terceiraFaixa;
        }
        valorImposto = salarioAnual;
        System.out.printf("Taxa sobre o salário anual: %.2f ",valorImposto);

    }
}
