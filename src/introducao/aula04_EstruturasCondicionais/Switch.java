package introducao.aula04_EstruturasCondicionais;

public class Switch {
    public static void main(String[] args) {
    // Imprima o dia da semana, considenrado 1 como domingo
    byte dia = 10;
    //char, int, byte, short, enum, String

    switch (dia) {
        case 1:
        System.out.println("Domingo");
            break;
        case 2:
        System.out.println("Segunda-Feira");
            break;
        case 3:
        System.out.println("Terça-Feira");
            break;
        case 4:
        System.out.println("Quarta-Feira");
            break;
        case 5:
        System.out.println("Quinta-Feira");
            break;
        case 6:
        System.out.println("Sexta-feira");
            break;
        case 7:
        System.out.println("Sábado");
            break;
        default:
        System.out.println("Opção inválida!");
            break;
    }

    char sexo = 'M';

    switch (sexo) {
        case 'M':
        System.out.println("Homem");           
            break;
        case 'F':
        System.out.println("Mulher");
        default:
        System.out.println("Inválido!");
            break;
    }

    }
    
}
