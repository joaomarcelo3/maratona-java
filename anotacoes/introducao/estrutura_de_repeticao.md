# Estruturas de Repetição

As estruturas de repetição permitem executar um bloco de código várias vezes, dependendo de uma condição.

## Estrutura `while`

O `while` executa um bloco de código enquanto a condição for verdadeira.

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

## Estrutura `do-while`

O `do-while` garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada no final.

```java
int contador = 1;
do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador <= 5);
```

## Estrutura `for`

O `for` é usado quando o número de repetições é conhecido previamente.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Contagem: " + i);
}
```

## Conclusão

As estruturas condicionais e de repetição são fundamentais para controlar o fluxo de execução de um programa. Saber usá-las de forma eficiente melhora a clareza e a manutenção do código.