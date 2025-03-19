# Estruturas Condicionais em Java

## Introdução

As estruturas condicionais são utilizadas para tomar decisões no código com base em expressões lógicas. Em Java, as principais são:

- `if`
- `if-else`
- `if-else-if`
- Operador ternário (`? :`)
- `switch`

## Estrutura `if`

O `if` é usado para executar um bloco de código se uma condição for verdadeira.

```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

## Estrutura `if-else`

O `if-else` permite executar um bloco de código caso a condição do `if` seja falsa.

```java
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

## Estrutura `if-else-if`

Usado quando há múltiplas condições.

```java
int nota = 85;
if (nota >= 90) {
    System.out.println("Aprovado com Excelência");
} else if (nota >= 70) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

## Operador Ternário

O operador ternário é uma forma reduzida de escrever um `if-else` simples.

```java
//(condicao) ? verdadeiro : falso
int idade = 20;
String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
System.out.println(mensagem);
```

### Operador Ternário com Múltiplas Condições

Para lidar com mais de uma condição, o operador ternário pode ser aninhado:

```java
int nota = 85;
String resultado = (nota >= 90) ? "Aprovado com Excelência" : 
                  (nota >= 70) ? "Aprovado" : "Reprovado";
System.out.println(resultado);
```

## Estrutura `switch`

O `switch` é utilizado quando há várias condições baseadas em um único valor. Ele substitui múltiplos `if-else` e melhora a legibilidade do código.

```java
int opcao = 2;
switch (opcao) {
    case 1:
        System.out.println("Opção 1 escolhida");
        break;
    case 2:
        System.out.println("Opção 2 escolhida");
        break;
    case 3:
        System.out.println("Opção 3 escolhida");
        break;
    default:
        System.out.println("Opção inválida");
}
```

### `switch` com `String`

O `switch` também pode ser usado com valores do tipo `String`.

```java
String dia = "segunda";
switch (dia) {
    case "segunda":
    case "terça":
    case "quarta":
    case "quinta":
    case "sexta":
        System.out.println("Dia útil");
        break;
    case "sábado":
    case "domingo":
        System.out.println("Fim de semana");
        break;
    default:
        System.out.println("Dia inválido");
}
```

## Estruturas de Repetição

As estruturas de repetição permitem executar um bloco de código várias vezes, dependendo de uma condição.

### Estrutura `while`

O `while` executa um bloco de código enquanto a condição for verdadeira.

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

### Estrutura `do-while`

O `do-while` garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada no final.

```java
int contador = 1;
do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador <= 5);
```

### Estrutura `for`

O `for` é usado quando o número de repetições é conhecido previamente.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Contagem: " + i);
}
```

### Estrutura `break`

O `break` é utilizado para interromper um loop antes que ele complete todas as iterações.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        System.out.println("Interrompendo o loop quando i = " + i);
        break;
    }
    System.out.println("Contagem: " + i);
}
```

No exemplo acima, quando `i` for igual a 5, o loop será interrompido e os valores restantes não serão impressos.

O `break` também pode ser usado em `while` e `do-while` para interromper a execução quando uma condição específica for atingida.

```java
int contador = 1;
while (contador <= 10) {
    if (contador == 5) {
        System.out.println("Loop interrompido no contador = " + contador);
        break;
    }
    System.out.println("Contagem: " + contador);
    contador++;
}
```
### Estrutura `continue`
O `continue` é utilizado para pular a iteração atual de um loop e continuar com a próxima iteração. Diferente do `break`, que encerra o loop por completo, o continue apenas faz com que o loop pule a parte restante do código na iteração atual e avance para a próxima.

### Exemplo com `for:`
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        System.out.println("Pulando a iteração quando i = " + i);
        continue;  // Pula a iteração quando i for igual a 5
    }
    System.out.println("Contagem: " + i);
}`
```

### Saída:

```java
Contagem: 1
Contagem: 2
Contagem: 3
Contagem: 4
Pulando a iteração quando i = 5
Contagem: 6
Contagem: 7
Contagem: 8
Contagem: 9
Contagem: 10
```

### Explicação: 
Quando `i` é igual a 5, a instrução `continue` faz com que a iteração atual seja pulada, ou seja, a linha `System.out.println("Contagem: " + i)`; não será executada para `i = 5`. O loop então continua com a próxima iteração.

### Exemplo com `while:`
```java
int contador = 1;
while (contador <= 10) {
    if (contador == 5) {
        System.out.println("Pulando a iteração no contador = " + contador);
        contador++;
        continue;  // Pula a iteração quando contador for igual a 5
    }
    System.out.println("Contagem: " + contador);
    contador++;
}
```
Explicação: Semelhante ao exemplo com `for`, o `continue` faz o loop pular a iteração quando `contador` for igual a 5, e o programa segue com as próximas iterações.

## Conclusão

As estruturas condicionais e de repetição são fundamentais para controlar o fluxo de execução de um programa. Saber usá-las de forma eficiente melhora a clareza e a manutenção do código.

