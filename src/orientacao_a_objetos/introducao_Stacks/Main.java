package orientacao_a_objetos.introducao_Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*Array
        * São estáticas e tem referência de memória*/
        String[] stringArray = new String[3];
        stringArray[0] = "Naruto Uzumaki";
        stringArray[1] = "Sasuke Uchiha";
        stringArray[2] = "Sakura Haruno";

        for (int i = 0; i < stringArray.length; i++){
            System.out.println("Array: " +stringArray[i]);
        }

        System.out.println("");

        /*Listas
        * são dinamicas, aumentam e diminuem conforme o necessário*/
        List<String> stringList = new ArrayList<>();
        stringList.add("Naruto Uzumaki");
        System.out.println("List: " + stringList);

        System.out.println("");

        /*Stack - pilha
        * O último elemento que entrou é obrigatoriamente o primeiro que sai LIFO (Last in First Out)*/
        Stack<String> stringStack = new Stack<>();
        //push() coloca elemento na pilha
        stringStack.push("Naruto Uzumaki");
        stringStack.push("Sasuke Uchiha");
        stringStack.push("Sakura Haruno");
        stringStack.push("Kakashi Hatake");
        System.out.println("Stack Original " + stringStack);

        System.out.println("");

        //pop() retira o elemento do topo da pilha
        stringStack.pop();
        System.out.println("Stack retirando kakashi com pop() " + stringStack);

        System.out.println("");

        //peek() verifica qual o próximo elemento do topo da pilha
        System.out.println("Próximo elemento da Stack é " + stringStack.peek());

        System.out.println("");

        /*size() verifica o tamanho das nossa pilha, verifica a quantidade de elementos
        *dentro dela*/
        System.out.println("Quantidade de elementos em minha Stack: " + stringStack.size());

    }
}
