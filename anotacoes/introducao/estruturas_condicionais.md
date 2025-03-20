# Estruturas Condicionais

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

## Conclusão

As estruturas condicionais e de repetição são fundamentais para controlar o fluxo de execução de um programa. Saber usá-las de forma eficiente melhora a clareza e a manutenção do código.

