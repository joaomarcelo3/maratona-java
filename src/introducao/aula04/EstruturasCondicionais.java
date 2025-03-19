package introducao.aula04;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 14;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcoólica");
            
        }else{
        System.out.println("Não pode comparar bebida alcoólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não pode comparar bebida alcoólica");
        }

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
