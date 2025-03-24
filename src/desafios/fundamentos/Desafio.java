package desafios.fundamentos;

/*
 * 1. Crie um programa que:
   - Leia 5 números de um array.
   - Calcule a média desses números.
   - Informe se a média é maior ou menor que 10.

2. Utilize pelo menos uma estrutura de repetição e uma condicional no código.

---
 */

public class Desafio {
    public static void main(String[] args) {
        
        double[] numeros = {4,8,9,3,20};
        double quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            quantidade += numeros[i];
        }

        double media = quantidade / numeros.length;

        System.out.println("Média: "+media);

        if (media > 10) {
            System.out.println("Média maior que 10");
        } else{
            System.out.println("Média menor que 10");
        }
    }
}
