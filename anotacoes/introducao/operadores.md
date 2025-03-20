# Operadores

Em Java, os operadores são símbolos especiais usados para realizar operações sobre variáveis e valores. Eles são essenciais para a construção de expressões e a lógica dos programas.

## 1. Operadores Aritméticos

Os operadores aritméticos são usados para realizar operações matemáticas básicas.

| Operador | Descrição  | Exemplo  | Resultado |
|----------|------------|----------|-----------|
| `+`      | Adição     | `5 + 3`  | `8`       |
| `-`      | Subtração  | `5 - 3`  | `2`       |
| `*`      | Multiplicação | `5 * 3` | `15`      |
| `/`      | Divisão    | `10 / 2` | `5`       |
| `%`      | Módulo (resto da divisão) | `10 % 3` | `1` |

### Exemplo de uso:

```java
int a = 10, b = 3;
System.out.println(a + b); // Saída: 13
System.out.println(a - b); // Saída: 7
System.out.println(a * b); // Saída: 30
System.out.println(a / b); // Saída: 3
System.out.println(a % b); // Saída: 1
```

## 1.1 Sobrecarga do Operador +
Em Java, o operador `+` pode ser usado tanto para somar valores numéricos quanto para concatenar `Strings`. Isso é chamado de sobrecarga do operador `+`.

### Exemplo de soma:
```java
int x = 5;
int y = 10;
int resultado = x + y;  // Soma numérica
System.out.println(resultado); // Saída: 15
```

### Exemplo de concatenação de Strings:
```java
String texto1 = "Olá, ";
String texto2 = "mundo!";
String mensagem = texto1 + texto2;  // Concatenação de Strings
System.out.println(mensagem); // Saída: Olá, mundo!
```
Se um dos operandos for uma `String`, o operador `+` converte o outro operando para `String` e realiza a concatenação:

```java
int idade = 25;
String mensagem = "Minha idade é " + idade;
System.out.println(mensagem); // Saída: Minha idade é 25
```
Essa sobrecarga torna o operador `+` muito útil para manipulação de texto e exibição de informações na tela.

## 1.2 Divisão de Variáveis Inteiras em Java

Quando você divide duas variáveis inteiras em Java, o resultado será sempre um valor inteiro. Se o resultado da divisão tiver uma parte decimal, ela será descartada. O Java realiza uma divisão de inteiros, que simplesmente ignora a parte fracionária do resultado e retorna apenas a parte inteira.

### Exemplo de Divisão com Inteiros

```java
int a = 10;
int b = 20;
int resultado = a / b;
System.out.println(resultado);  // Saída: 0
```
Neste exemplo, 10 / 20 resulta em 0.5, mas como estamos trabalhando com variáveis do tipo `int`, o Java ignora a parte decimal e retorna 0.

### Como Obter um Resultado Decimal?
Se você deseja que a divisão retorne um número com casas decimais, é necessário realizar um casting para um tipo de dado que suporte decimais, como `double` ou `float`. Isso permite que o Java preserve a parte decimal do cálculo.

### Exemplo com double
```java
int a = 10;
int b = 20;
double resultado = (double) a / b;
System.out.println(resultado);  // Saída: 0.5
```
No exemplo acima, ao forçar o valor de a para `double` com o cast (double), a divisão resultará corretamente em 0.5.

Quando se trabalha com a divisão de variáveis inteiras em Java, sempre tenha em mente que o Java irá descartar a parte decimal do resultado se ambos os operandos forem inteiros. Para obter resultados decimais, é preciso utilizar tipos como `double` ou `float` através de conversão explícita.

## 2. Operadores Relacionais

Os operadores relacionais são usados para comparar dois valores e retornam `true` ou `false`.

| Operador | Descrição          | Exemplo  | Resultado |
|----------|-------------------|----------|-----------|
| `==`     | Igual a           | `5 == 5` | `true`    |
| `!=`     | Diferente de      | `5 != 3` | `true`    |
| `>`      | Maior que         | `5 > 3`  | `true`    |
| `<`      | Menor que         | `5 < 3`  | `false`   |
| `>=`     | Maior ou igual a  | `5 >= 5` | `true`    |
| `<=`     | Menor ou igual a  | `5 <= 3` | `false`   |

### Exemplo de uso:

```java
int x = 10, y = 5;
System.out.println(x > y);   // Saída: true
System.out.println(x < y);   // Saída: false
System.out.println(x == 10); // Saída: true
System.out.println(y != 5);  // Saída: false
```

## 2.1 Comparando String com Valor Numérico em Java

Em Java, **não é possível comparar diretamente uma `String` com um valor numérico** usando operadores relacionais. Isso ocorre porque a `String` é um tipo de objeto, enquanto os valores numéricos são tipos primitivos. Para realizar essa comparação, é necessário converter a `String` em um tipo numérico (como `int`, `double`, etc.) antes de compará-la com o número.

## 2.2 Como Comparar uma `String` com um Número?

### Conversão de `String` para Tipo Numérico

Você deve usar métodos de conversão da classe `Integer`, `Double` ou `Float` para transformar a `String` em um número. Aqui está um exemplo de como fazer isso.

### Exemplo de Comparação com `Integer.parseInt()` (para `int`)

```java
String str = "10";  // String com valor numérico
int numero = 10;

if (Integer.parseInt(str) == numero) {
    System.out.println("As variáveis são iguais.");
} else {
    System.out.println("As variáveis são diferentes.");
}
```

### Explicação:
- O `método Integer.parseInt(str)` converte a `String` em um valor `int`, permitindo a comparação com a variável `numero`, que também é do tipo `int`.
- O operador `==` pode ser usado para comparar os valores inteiros resultantes.

## 2.3 Erro ao Comparar Diretamente `String` e `int`
Se você tentar fazer a comparação diretamente sem conversão, como mostrado abaixo, ocorrerá um erro de compilação:

```java
String str = "10";
int numero = 10;

if (str == numero) {  // Erro de compilação
    System.out.println("São iguais!");
}
```

Isso não funcionará, pois `str` é um objeto (do tipo `String`), enquanto numero é um valor primitivo (`int`).

## 2.4 Comparando Strings
Para comparar o conteúdo de duas `Strings` em Java, você deve usar o método `.equals()` ou `.compareTo()`, e não o operador `==`, que compara referências, não os conteúdos das Strings.

Exemplo de Comparação de Strings
```java
String str1 = "10";
String str2 = "10";

if (str1.equals(str2)) {
    System.out.println("As Strings são iguais.");
} else {
    System.out.println("As Strings são diferentes.");
}
```

Não é possível comparar diretamente uma String com um valor numérico utilizando operadores relacionais em Java.
Para comparar uma String com um número, você precisa converter a String para um tipo numérico usando métodos como Integer.parseInt(), Double.parseDouble(), etc.
Para comparar o conteúdo de duas Strings, use os métodos .equals() ou .compareTo().

# 3.Operadores Lógicos AND (&&) e OR (||)

Os operadores lógicos **AND (&&)** e **OR (||)** são usados para combinar duas ou mais expressões booleanas. Eles são fundamentais para a avaliação de condições compostas em estruturas de controle de fluxo, como `if`, `while`, etc.

## 3.1 Operador Lógico AND (&&) em Java

O **operador lógico AND (&&)** é usado para combinar duas ou mais expressões booleanas. Ele retorna `true` somente se **todas as expressões** envolvidas forem verdadeiras. Se qualquer uma das expressões for falsa, o resultado será `false`.

## Tabela de Resultados do Operador AND (&&)

| Expressão 1 | Expressão 2 | Resultado |
|-------------|-------------|-----------|
| true        | true        | true      |
| true        | false       | false     |
| false       | true        | false     |
| false       | false       | false     |

### Explicação:
- O operador **AND (&&)** verifica se **todas as condições** fornecidas são verdadeiras. Se alguma das condições for falsa, o resultado será `false`. 
- **Somente** quando **todas as condições forem verdadeiras** é que o operador retorna `true`.

## Exemplo de Uso do AND (&&):

```java
boolean cond1 = (5 > 3);   // true
boolean cond2 = (10 < 5);  // false

System.out.println(cond1 && cond2);  // Saída: false
System.out.println(true && true);    // Saída: true
```

## 3.2 Operador Lógico OR (||) em Java

O **operador lógico OR (||)** é usado para avaliar duas ou mais expressões booleanas e retorna `true` se **pelo menos uma** das expressões for verdadeira. Caso todas as expressões sejam falsas, o resultado será `false`.

## Tabela de Resultados do Operador Lógico OR

| Expressão 1 | Expressão 2 | Resultado |
|-------------|-------------|-----------|
| true        | true        | true      |
| true        | false       | true      |
| false       | true        | true      |
| false       | false       | false     |

## Exemplo de Uso

```java
boolean cond1 = (5 > 3);   // true
boolean cond2 = (10 < 5);  // false

System.out.println(cond1 || cond2); // Saída: true
System.out.println(false || false); // Saída: false
```

O **operador lógico OR (||)** é utilizado para avaliar duas ou mais expressões booleanas, retornando `true` se **pelo menos uma** das expressões for verdadeira. Se todas as expressões forem falsas, o resultado será `false`.

- **Primeiro exemplo**: Quando `cond1` é `true` e `cond2` é `false`, o operador OR (||) retorna `true`, pois pelo menos uma das expressões é verdadeira.

- **Segundo exemplo**: Quando ambas as condições são falsas, o resultado da comparação será `false`.

### Uso com Múltiplas Condições

Você pode utilizar o operador OR para combinar várias condições. Se qualquer uma delas for verdadeira, o resultado será `true`.


```java
boolean a = (5 < 10);     // true
boolean b = (10 == 10);   // true
boolean c = (20 > 30);    // false
System.out.println(a || b || c);  // Saída: true
```
### Explicação:
a e b são true, então a expressão a || b || c resulta em true, mesmo que c seja false.

O operador lógico OR (||) é utilizado para combinar duas ou mais expressões booleanas e retorna true se pelo menos uma delas for verdadeira.
É útil em diversas situações de controle de fluxo, como verificações de múltiplas condições em um if.


# 4. Operadores de Atribuição

Os operadores de atribuição são usados para armazenar valores em variáveis.

| Operador | Descrição                  | Exemplo  | Equivalente a  |
|----------|----------------------------|----------|--------------- |
| `=`      | Atribuição simples         | `x = 10`  | `x recebe 10`  |
| `+=`     | Adição e atribuição        | `x += 5`  | `x = x + 5`    |
| `-=`     | Subtração e atribuição     | `x -= 3`  | `x = x - 3`    |
| `*=`     | Multiplicação e atribuição | `x *= 2`  | `x = x * 2`    |
| `/=`     | Divisão e atribuição       | `x /= 4`  | `x = x / 4`    |
| `%=`     | Módulo e atribuição        | `x %= 3`  | `x = x % 3`    |

### Exemplo de uso:

```java
int numero = 10;
numero += 5;  // Agora numero é 15
numero *= 2;  // Agora numero é 30
numero /= 3;  // Agora numero é 10
```

## 4.1 Operadores de Incremento e Decremento (`++` e `--`)

No mundo dos **operadores atribuídos**, os operadores `++` e `--` são utilizados para **incrementar** ou **decrementar** valores numéricos de forma concisa. Eles são frequentemente usados em **laços de repetição** e manipulação de variáveis numéricas.

## **Incremento (`++`)**
O operador `++` **adiciona 1** ao valor da variável.

```java
int contador = 5;
contador++; // Agora contador vale 6
Decremento (--)
O operador -- subtrai 1 do valor da variável.
```

```java
int contador = 5;
contador--; // Agora contador vale 4
Pré-incremento (++contador) e Pós-incremento (contador++)
Esses operadores podem ser usados antes (++contador) ou depois (contador++) da variável, e isso influencia o momento da atualização do valor.
```

## Pós-incremento (`contador++`)
O pós-incremento retorna o valor atual da variável antes de incrementá-la.

```java
int x = 5;
int y = x++; // Primeiro y recebe 5, depois x é incrementado para 6
System.out.println("x: " + x); // Saída: x: 6
System.out.println("y: " + y); // Saída: y: 5
Pré-incremento (++contador)
```

O pré-incremento incrementa a variável antes de retorná-la.

```java
int x = 5;
int y = ++x; // Primeiro x é incrementado para 6, depois y recebe 6
System.out.println("x: " + x); // Saída: x: 6
System.out.println("y: " + y); // Saída: y: 6
```
O mesmo conceito se aplica ao pré-decremento (`--contador`) e ao pós-decremento (`contador--`), que seguem a mesma lógica, mas diminuindo o valor em 1.

### Quando Usar Cada Um?
Pré-Incremento (`++contador`)

Quando você precisa incrementar primeiro e depois usar o valor atualizado.
Em loops e operações matemáticas onde a atualização imediata do valor é importante.
Pós-Incremento (`contador++`)

Quando você precisa usar o valor atual primeiro e só depois incrementá-lo.
Em expressões onde o valor anterior ainda precisa ser processado antes do incremento.

### Conclusão
Os operadores são fundamentais para a lógica de qualquer programa Java. Cada categoria tem sua utilidade:

- Aritméticos: Para cálculos matemáticos.
- Relacionais: Para comparações de valores.
- Lógicos (&&): Para construir condições mais complexas.
- Atribuição: Para armazenar e modificar valores de forma mais eficiente.








