package orientacao_a_objetos.introducao_metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 11);
    }

    public void multiplicaDoiNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2){
        if (num2 == 0){
            return 0;
        } else{
            return num/num2;
        }
    }

    public double divideDoisNumero2(double num, double num2){
        if (num2 != 0) {
            return num/num2;
        }
        return 0;
    }

    public void divideDoisNumeros3(double num, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        System.out.println("Soma dos numéros: "+soma);
    }
    
}
