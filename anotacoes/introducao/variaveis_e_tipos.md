# Tipos Primitivos em Java  

## O que são tipos primitivos ?  
Tipos primitivos são os tipos de dados mais básicos do Java, usados para armazenar valores simples diretamente na memória, sem a necessidade de um objeto.  

## Lista de Tipos Primitivos  

| Tipo    | Tamanho (bits) | Valor Mínimo | Valor Máximo | Exemplo |
|---------|--------------|-------------|-------------|---------|
| `byte`  | 8  | -128 | 127 | `byte b = 100;` |
| `short` | 16 | -32.768 | 32.767 | `short s = 20000;` |
| `int`   | 32 | -2.147.483.648 | 2.147.483.647 | `int i = 150000;` |
| `long`  | 64 | -9 quintilhões | 9 quintilhões | `long l = 15000000000L;` |
| `float` | 32 | ±3.4E-38 | ±3.4E+38 | `float f = 3.14f;` |
| `double`| 64 | ±1.7E-308 | ±1.7E+308 | `double d = 3.141592;` |
| `char`  | 16 | '\u0000' | '\uffff' | `char c = 'A';` |
| `boolean` | 1 | `false` | `true` | `boolean ativo = true;` |

## Características Importantes  
- Todos os tipos primitivos são escritos **com letras minúsculas**, pois são palavras reservadas.  
- Diferente de objetos, **não possuem métodos** associados.  
- São mais eficientes, pois ocupam menos espaço na memória.  

## Diferença entre Tipos Primitivos e Objetos  
- **Primitivos**: armazenam valores diretamente na memória.  
- **Objetos**: armazenam referências e possuem métodos.  

Exemplo:  
```java
int age = 25;       // Tipo primitivo
Integer ageObj = 25; // Objeto da classe Integer
```

# Boas Práticas de Programação em Java

## 1. Convenções de nomenclatura  

### **Variáveis e atributos**  
- **Devem começar com letra minúscula**.  
- **Usar CamelCase** para palavras compostas.
- **Em inglês** como boa prática.  
- **Evitar abreviações excessivas** que dificultem a leitura.  
- **Nomes devem ser significativos**, descrevendo claramente o que a variável armazena. 

Exemplo:  
```java
int studentAge = 20;
double wage = 3500.75;
boolean activeAccount = true;
```

### 1.2 Constantes
- Devem ser sempre escritas em letras maiúsculas.
- Usar underscore (`_`) para separar palavras.
- Utilizar `final` para indicar que o valor não pode ser alterado.

Exemplo:
```java
final double PI = 3.14159;
final int MAX_TENTATIVAS = 5;
```

### 1.3 Classes
- Sempre começar com letra maiúscula.
- Usar CamelCase para palavras compostas.

Exemplo:
```java
public class ClientePremium{
    // Código da classe
}
```

### 1.4 Métodos
- Devem começar com letra minúscula.
- Usar verbos para indicar a ação realizada pelo método.
- Aplicar CamelCase em palavras compostas.

Exemplo:
```java
public void calcularMedia() { ... }

public String obterNomeCompleto() { ... }
```

### 1.5 Pacotes
- Devem sempre ser escritos em minúsculas.
- Normalmente seguem o padrão de domínio invertido para evitar conflitos de nomes.

Exemplo:
```java
package com.meuprojeto.util;
```

# 2. Boas Práticas

### 2.1 Indentação e Organização
- Utilize 4 espaços ou tabulação para manter a indentação clara.
- Mantenha o código bem estruturado e organizado para facilitar a leitura.

Exemplo:
```java
public class Exemplo {
    public static void main(String[] args) {
        int idade = 25;
        System.out.println("Idade: " + idade);
    }
}
```

### 2.2 Comentários
- Use comentários claros e objetivos.
- Comentários de uma linha: //
- Comentários de múltiplas linhas: /* ... */
- Utilize Javadoc (/** ... */) para documentar métodos e classes.

Exemplo:
```java
/**
 * Calcula o valor do imposto com base no salário.
 * @param salario Salário do funcionário.
 * @return Valor do imposto a ser pago.
 */
public double calcularImposto(double salario) {
    return salario * 0.15;
}
```

### 2.3 Boas Práticas em Declaração de Variáveis
- Evite nomes genéricos como x, y, variavel1.
- Prefira nomes autoexplicativos para melhorar a legibilidade do código.

Exemplo:
```java
// Ruim
int x = 10;

// Melhor
int quantidadeDeProdutos = 10;
```

### 2.4 Uso de var no Java 10+
- var pode ser usado para inferência de tipo, mas deve ser aplicado com moderação.
- Não pode ser usada para variáveis de classe ou atributos.

Exemplo:
```java
var nome = "João";  // O Java entende que 'nome' é do tipo String
var idade = 30;      // O Java entende que 'idade' é do tipo int
```

# Casting em Java

O **casting** em Java é o processo de conversão de um tipo de dado para outro. Existem dois tipos principais de casting: **casting implícito** e **casting explícito**.

## Tipos de Casting

### 1. Casting Implícito (Auto-Casting)

O **casting implícito** acontece automaticamente quando você converte um tipo de dado menor para um tipo maior. O Java faz isso sem a necessidade de intervenção do programador, pois a conversão não causa perda de dados.

#### Exemplo de Casting Implícito:

```java
int numero = 10;
double resultado = numero;  // O valor de 'numero' é automaticamente convertido para 'double'
System.out.println(resultado);  // Saída: 10.0

//Neste caso, o valor do tipo int foi automaticamente convertido para double.
```

### 2. Casting Explícito (Forced Casting)

Você deve usar o **casting explícito** quando:

- **Converter tipos maiores para tipos menores:** Quando você deseja armazenar um valor maior em um tipo menor, como de `double` para `int`, ou de `long` para `short`.
- **Evitar perda de dados:** Em alguns casos, o Java não pode fazer a conversão automaticamente (como de `double` para `int`), pois a conversão pode causar perda de dados.

### Exemplo de Conversão de Tipos Maiores para Menores:

```java
long numeroLong = 1000L;
int numeroInt = (int) numeroLong;  // Casting explícito para um tipo menor
System.out.println(numeroInt);  // Saída: 1000
//Neste caso, o valor de long foi convertido para int.
```

# Strings em Java

Em Java, as Strings são objetos imutáveis que representam sequências de caracteres. Elas oferecem uma ampla gama de funcionalidades para manipulação de texto.

## Declaração de uma String

Para declarar uma String em Java, usamos a classe `String`, que é um tipo de objeto. A forma mais comum de declarar é atribuindo diretamente um valor à variável.

### Exemplo de Declaração de String:

```java
String nome = "João";  // A String "João" é atribuída à variável 'nome'

//Aqui, a String nome contém o valor "João". Vale lembrar que o tipo String em Java é um objeto e não um tipo primitivo.
```

## Operações Comuns com Strings

### 1. Concatenando Strings
Você pode juntar duas ou mais Strings usando o operador +.

Exemplo:
```java
String saudacao = "Olá, ";
String nome = "João";
String mensagem = saudacao + nome;  // A String "Olá, João" será formada
System.out.println(mensagem);  // Saída: Olá, João
```

### 2. Comparando Strings
As Strings podem ser comparadas utilizando o método .equals() ou .compareTo().

Exemplo de Comparação:
```java
String a = "Java";
String b = "Java";
String c = "Python";

System.out.println(a.equals(b));  // Saída: true
System.out.println(a.equals(c));  // Saída: false
```
- .equals() verifica se o conteúdo das Strings é igual.
- .compareTo() retorna um valor que indica se uma String é lexicograficamente maior, menor ou igual à outra.

### 3. Verificando o Tamanho da String
Você pode obter o número de caracteres de uma String usando o método .length().

Exemplo:
```java
String texto = "Java";
int tamanho = texto.length();  // Retorna o número de caracteres
System.out.println(tamanho);  // Saída: 4
```

### 4. Manipulando Strings
Existem muitos métodos para manipular Strings, como substring(), toUpperCase(), toLowerCase(), entre outros.

Exemplo:
```java
String frase = "Aprendendo Java";
String subFrase = frase.substring(0, 10);  // Retorna "Aprendendo"
System.out.println(subFrase);

String minuscula = frase.toLowerCase();  // "aprendendo java"
System.out.println(minuscula);
```

### Imutabilidade das Strings
Em Java, uma String é imutável, o que significa que, uma vez criada, ela não pode ser modificada. Qualquer operação que modifique o valor de uma String na verdade cria um novo objeto String.

Exemplo:

```java
String s = "Olá";
s = s + " Mundo";  // Isso cria uma nova String
System.out.println(s);  // Saída: Olá Mundo
```
Neste exemplo, uma nova String foi criada com o valor "Olá Mundo", e a String original não foi alterada.

### Conclusão
- Casting permite manipular tipos de dados de forma controlada, garantindo que as conversões sejam feitas corretamente.
- Strings são objetos especiais em Java, que fornecem uma série de métodos úteis para manipulação de texto.
