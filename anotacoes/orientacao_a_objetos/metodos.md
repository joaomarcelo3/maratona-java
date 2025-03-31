# Métodos

## O que são métodos?

Métodos são blocos de código que realizam uma ação específica. Eles ajudam a organizar o código, reutilizar lógica e implementar comportamentos nas classes.

### Estrutura de um método:

```java
modificadorDeAcesso tipoDeRetorno nomeDoMetodo(parâmetros) {
    // corpo do método
    return valor; // se o tipo de retorno não for void
}
```

---

## Exemplos de métodos

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
```

```java
Calculadora calc = new Calculadora();
int resultado = calc.somar(10, 5);
System.out.println("Resultado: " + resultado);
```

---

## Tipos de Métodos

| Tipo                          | Exemplo                               |
|-------------------------------|----------------------------------------|
| Com retorno e com parâmetros | `int somar(int a, int b)`              |
| Com retorno e sem parâmetros | `String saudacao()`                    |
| Sem retorno e com parâmetros | `void exibirMensagem(String nome)`    |
| Sem retorno e sem parâmetros | `void mostrarMensagem()`              |

---

## Conceitos importantes

### Tipo de retorno
- Define o tipo de dado que o método retorna.
- Se não retorna nada, usa-se `void`.

```java
public void mensagem() {
    System.out.println("Olá, mundo!");
}
```

###  Parâmetros
- São valores que o método precisa para executar.

```java
public void imprimirNome(String nome) {
    System.out.println("Olá, " + nome);
}
```

### Chamada de métodos

```java
objeto.nomeDoMetodo(parâmetros);
```

---

## Diferença entre Atributos e Métodos

| Atributo                     | Método                                |
|-----------------------------|----------------------------------------|
| Representa um dado          | Representa um comportamento            |
| Não usa parênteses          | Usa parênteses                         |
| Pode ser acessado diretamente | Executa uma ação                      |

```java
public class Pessoa {
    String nome;

    public void dizerOla() {
        System.out.println("Olá, " + nome);
    }
}
```

---

###  O que é `static`?

O modificador `static` indica que um **atributo ou método pertence à classe**, e **não a uma instância** (objeto).

---

### Atributos estáticos

- Compartilhados entre todas as instâncias da classe.
- São acessados diretamente pela classe.

```java
public class Carro {
    public static String marca = "Toyota";
    public String modelo;
}
```

```java
System.out.println(Carro.marca); // Acessa sem instanciar um objeto
```

---

### Métodos estáticos

- Também pertencem à classe.
- Podem ser chamados sem criar objetos.
- **Não podem acessar atributos ou métodos de instância diretamente.**

```java
public class Util {
    public static void imprimirMensagem(String msg) {
        System.out.println(msg);
    }
}
```

```java
Util.imprimirMensagem("Olá!"); // Chamada sem instanciar
```