# Métodos em Java

## O que são métodos em Java?

Em Java, **métodos** são blocos de código que realizam uma ação específica. Eles são usados para organizar o programa em partes menores e reutilizáveis.

### Estrutura de um método em Java

```java
modificadorDeAcesso tipoDeRetorno nomeDoMetodo(parâmetros) {
    // Corpo do método: aqui vai o código
    return valor; // (se não for void)
}
```

### Exemplo prático:

```java
public class Calculadora {
    // Método que soma dois números
    public int somar(int a, int b) {
        return a + b; // Retorna a soma
    }
}

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(10, 20);
        System.out.println("Resultado: " + resultado); // Saída: Resultado: 30
    }
}
```

---

## Conceitos importantes sobre métodos

### 1. **Tipo de retorno**

Indica o tipo de dado que o método devolve. Se o método não retornar nada, usamos `void`.

**Exemplo de método com retorno:**

```java
public int multiplicar(int a, int b) {
    return a * b; // Retorna um inteiro
}
```

**Exemplo de método sem retorno (**\`\`**):**

```java
public void exibirMensagem() {
    System.out.println("Olá, mundo!");
}
```

### 2. **Parâmetros de entrada**

São valores que passamos para o método executar sua lógica.

**Exemplo com dois parâmetros:**

```java
public int somar(int a, int b) {
    return a + b;
}
```

Se um método não precisa de parâmetros, basta deixar os parênteses vazios:

```java
public void mensagemPadrao() {
    System.out.println("Bem-vindo!");
}
```

### 3. **Chamando métodos**

Para usar um método, criamos um objeto e usamos a notacão de ponto (`.`).

```java
Calculadora calc = new Calculadora();
calc.somar(5, 10);
```

---

## Diferença entre atributos e métodos

| **Atributo**                  | **Método**                            |
| ----------------------------- | ------------------------------------- |
| Representa um dado (variável) | Representa uma ação ou comportamento  |
| Não usa parênteses            | Usa parênteses (mesmo sem parâmetros) |
| Pode ser lido ou modificado   | Executa uma tarefa ou calcula algo    |

**Exemplo:**

```java
public class Pessoa {
    String nome; // Atributo

    public void dizerOla() { // Método
        System.out.println("Olá, " + nome);
    }
}
```

---

## Exercício prático

Crie uma classe `CalculadoraAvancada` com os seguintes métodos:

1. `public int subtrair(int a, int b)` - Retorna a diferença entre dois números.
2. `public void exibirMensagem()` - Imprime "Calculadora em funcionamento".

Teste esses métodos em uma classe `CalculadoraAvancadaTeste` no `main`.

- [Exercício Prático](introducao)


---


