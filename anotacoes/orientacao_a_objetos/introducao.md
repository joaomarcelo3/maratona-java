# Entendendo Classes e Objetos

## 1. O que é Orientação a Objetos (OO)?

- **Definição:** Orientação a Objetos (OO) é um paradigma de programação que organiza o código em torno de objetos que representam entidades do mundo real.
- **Objetivo:** Agrupar atributos (características) e comportamentos (métodos) em estruturas chamadas **objetos**.

### Exemplo do Mundo Real

Uma **Pessoa** possui características como **nome**, **idade** e **sexo**.

Em Java, essas características viram **atributos** em uma classe `Pessoa`.

---

## 2. O que são Classes e Objetos?

### Classe

- É um **modelo (ou molde)** para criar objetos.
- Define os atributos e comportamentos.

### Objeto

- É uma **instância** de uma classe, ou seja, a realização concreta com valores reais.

### Exemplo em Java

```java
// Classe Pessoa (define o modelo)
public class Pessoa {
    String nome;
    int idade;
    char sexo;
}

// Criando um objeto da classe Pessoa
Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "Carlos";
pessoa1.idade = 25;
pessoa1.sexo = 'M';
```

Neste exemplo, `pessoa1` é um objeto da classe `Pessoa`.

---

##  3. Diferença entre Tipos Primitivos e Objetos

###  Tipos Primitivos

- Armazenam valores simples diretamente na memória.
  - Ex.: `int`, `char`, `double`, `boolean`.

###  Objetos

- Armazenam referências que apontam para um espaço na memória.

###  Exemplo

```java
// Tipo primitivo
int idade = 25; // Valor direto na memória

// Objeto
Pessoa pessoa1 = new Pessoa(); // Referência na memória
```

---

##  4. Criando e Organizando Pacotes

###  O que é um Pacote?

- É uma forma de **organizar** suas classes em Java.

###  Exemplo de Estrutura de Pacotes

```
src/
├── orientacao_a_objetos/
│
│── dominio/
│     └── Estudante.java
│
└── test/
      └── EstudanteTest.java
```

---

## 5. Criando um Objeto e Acessando Atributos

###  Passos para Criar um Objeto

1. **Declarar a variável de referência** (do tipo da classe).
2. **Criar o objeto** com `new`.
3. **Acessar atributos** usando o operador `.`.

###  Exemplo Prático

```java
// Classe Estudante
package dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
}
```

```java
// Classe TesteEstudante
package introducao;

import dominio.Estudante;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ana";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
```

###  Saída no Console

```
Nome: Ana
Idade: 20
Sexo: F
```

---

##  6. Importando Classes de Outros Pacotes

Se a classe está em outro pacote, você precisa **importar** no início do código.

### Exemplo

```java
import dominio.Estudante; // Importa a classe Estudante
```

---

##  7. Variável de Referência e Objeto

### Diferença entre Referência e Objeto

- **Variável de Referência:** Guarda o endereço na memória onde o objeto está localizado.
- **Objeto:** É a instância real armazenada na memória.

### Exemplo

```java
Estudante estudante1 = new Estudante();
Estudante estudante2 = new Estudante();

estudante1.nome = "Carlos";
estudante2.nome = "Luffy";
```

Cada `Estudante` ocupa um **espaço diferente na memória**.

---

## Resumo Final

1. **Classe**: É um molde que define atributos e comportamentos.
2. **Objeto**: É uma instância concreta da classe.
3. **Tipos Primitivos vs. Objetos**: Primitivos armazenam valores diretos, objetos armazenam referências.
4. **Pacotes**: Organizam as classes de forma estruturada.
5. **Importações**: Permitem usar classes de outros pacotes.

