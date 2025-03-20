# Arrays 

Arrays em Java são estruturas de dados que armazenam múltiplos valores do mesmo tipo em posições indexadas. Eles são objetos na memória e possuem tamanho fixo após a criação.

## Valores Padrão dos Arrays

Se um array for criado sem ser explicitamente inicializado, cada posição recebe um valor padrão conforme o tipo:

| Tipo                      | Valor Padrão      |
| ------------------------- | ----------------- |
| `byte`                    | `0`               |
| `short`                   | `0`               |
| `int`                     | `0`               |
| `long`                    | `0L`              |
| `float`                   | `0.0f`            |
| `double`                  | `0.0d`            |
| `char`                    | `'�'` (null char) |
| `boolean`                 | `false`           |
| `String` e outros objetos | `null`            |

## Criando um Array

A sintaxe básica para declarar e inicializar um array é:

```java
// Declaração e inicialização
int[] numeros = new int[5]; // Array de inteiros com 5 posições

// Outra forma de inicializar
int[] valores = {10, 20, 30, 40, 50};
```

### Imprimindo um Array

A maneira mais simples de imprimir um array é usando um loop `for`:

```java
for (int i = 0; i < valores.length; i++) {
    System.out.println(valores[i]);
}
```

Ou utilizando `Arrays.toString()`:

```java
import java.util.Arrays;

System.out.println(Arrays.toString(valores));
```

Saída esperada:

```
[10, 20, 30, 40, 50]
```

## Arrays Multidimensionais

Java suporta arrays multidimensionais, como matrizes bidimensionais:

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Acessando elementos
System.out.println(matriz[1][2]); // Saída: 6
```

Também é possível criar **arrays irregulares**, onde as linhas têm tamanhos diferentes:

```java
int[][] irregular = new int[3][];
irregular[0] = new int[2]; // Linha 0 tem 2 colunas
irregular[1] = new int[4]; // Linha 1 tem 4 colunas
irregular[2] = new int[3]; // Linha 2 tem 3 colunas
```

## Uso de `for` aninhado

Em algumas situações, pode ser necessário utilizar um loop `for` dentro de outro `for`, por exemplo, para gerar combinações de valores:

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

Saída esperada:

```
i: 1, j: 1
i: 1, j: 2
i: 1, j: 3
i: 2, j: 1
i: 2, j: 2
i: 2, j: 3
i: 3, j: 1
i: 3, j: 2
i: 3, j: 3
```

## Uso de `for-each` aninhado

Também podemos utilizar loops `for-each` aninhados para percorrer arrays multidimensionais:

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int[] linha : matriz) {
    for (int elemento : linha) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
```

Saída esperada:

```
1 2 3 
4 5 6 
7 8 9 
```

## Percorrendo Arrays com `for-each`

O loop `for-each` é uma maneira simplificada de percorrer um array sem precisar lidar com índices manualmente:

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println(num);
}
```

Isso evita erros comuns como acesso a índices fora do limite e torna o código mais legível.

## Conclusão

Os arrays são fundamentais em Java para armazenar e manipular coleções de dados. O uso do `for-each` facilita a iteração, e arrays multidimensionais permitem a modelagem de estruturas mais complexas.



