package orientacao_a_objetos.introducao_Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    //Array
    String[] stringsArray = new String[3];

    //List
    List<String> stringList = new ArrayList<>();

    //Stack
    Stack<String> stringStack = new Stack<>();

    /*Queue - fila
    *A Queue é estrutura de dados que segue o princípio FIFO (First In, First Out)
    * Sua estrutura consistem em head e tail, sendo head o primeiro da fila e tail o último
     */
    Queue<String> ninjasQueue = new LinkedList<>();
    //add() adicional um elementado a fila
    ninjasQueue.add("Naruto");
    ninjasQueue.add("Sasuke");
    ninjasQueue.add("Sakura");
    ninjasQueue.add("Hinata");
    ninjasQueue.add("Kakashi");
    ninjasQueue.add("Shikamaru");

    System.out.println("Queue: " + ninjasQueue);
    ninjasQueue.add("Tobirama Senju");
    ninjasQueue.add("Hashirama Seunju");

    // offer() tenta adicionar um elemento a lista, se não conseguir retorna false
    System.out.println(ninjasQueue.offer("Hinata"));

    //poll() retira o head (o primeiro) da Queue
    ninjasQueue.poll();
    System.out.println("Queue após o poll: " + ninjasQueue);

    //peek() verifica qual o próximo elemento da fila
    System.out.println("O primeiro da fila: " + ninjasQueue.peek());

    //NÃO TEM COMO DELETAR O TAIL.

      while (!ninjasQueue.isEmpty()){
          if (ninjasQueue.element() == "Shikamaru"){
              break;
          }else {
              System.out.println(ninjasQueue);
              ninjasQueue.poll();
          }
      }
        //isEmpty() verifica sem a fila está fazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia!");
        }else {
            System.out.println("A fila não está vazia: " + ninjasQueue);
        }

    }
}
