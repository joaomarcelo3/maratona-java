# Complexidade de Algoritmos

## 1. O que é Complexidade de Algoritmos?

- **Definição:** É uma medida de desempenho que indica o tempo ou espaço necessário para executar um algoritmo em função do tamanho de sua entrada.
- **Objetivo:** Avaliar a **eficiência** de um algoritmo, permitindo comparar diferentes soluções para o mesmo problema.

### Por que Importa?

Compreender a complexidade permite escolher as soluções mais eficientes, especialmente com grandes conjuntos de dados. Um algoritmo com complexidade menor é mais **escalável** e roda com mais rapidez e menor uso de memória.

---

## 2. Tipos de Complexidade

### Complexidade de Tempo

- Refere-se ao **tempo** necessário para executar o algoritmo.
- Expressa geralmente em **notação Big O**, que mostra como o tempo de execução cresce em relação ao aumento da entrada.

### Complexidade de Espaço

- Refere-se à **quantidade de memória** necessária para executar o algoritmo.
- Inclui o espaço para variáveis, estruturas de dados e chamadas de função.

---

## 3. Principais Classes de Complexidade de Tempo

### O(1) — Constante

- A execução leva o **mesmo tempo**, independentemente do tamanho da entrada.

```java
// Acessar um elemento pelo índice — sempre O(1)
int valor = lista.get(0);
```

### O(log n) — Logarítmica

- O tempo cresce **logaritmicamente** com o tamanho da entrada.
- Comum em algoritmos que dividem a entrada pela metade a cada passo, como a **busca binária**.
- ⚠️ Só funciona em dados **ordenados**.

### O(n) — Linear

- O tempo cresce **linearmente** com o tamanho da entrada.
- Exemplo: percorrer todos os elementos de uma lista.

```java
for (int i = 0; i < n; i++) {
    // processa cada elemento uma vez
}
```

### O(n log n) — Linearítmica

- Combinação de crescimento linear e logarítmico.
- Comum em algoritmos de ordenação eficientes, como **mergesort** e **heapsort**.

### O(n²) — Quadrática

- O tempo cresce **quadraticamente** em relação ao tamanho da entrada (⚠️ não é exponencial).
- Exemplo: algoritmos de ordenação simples, como o **bubble sort** (loops aninhados).

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // n × n operações
    }
}
```

### O(2ⁿ) — Exponencial

- O tempo **dobra** a cada aumento de uma unidade na entrada.
- Comum em algoritmos de força bruta que exploram todas as combinações possíveis, como o problema da soma de subconjuntos.

---

## 4. Ordem de Crescimento (do melhor para o pior)

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ)
```

---

## 5. Tabela de Complexidade

| Tamanho da Entrada (n) | O(1) | O(log n) | O(n) | O(n log n) | O(n²)      | O(2ⁿ)          |
|-------------------------|------|----------|------|------------|------------|----------------|
| 1                        | 1    | 0        | 1    | 0          | 1          | 2              |
| 10                       | 1    | 3        | 10   | 30         | 100        | 1.024          |
| 100                      | 1    | 6        | 100  | 600        | 10.000     | ≈ 1,27 × 10³⁰  |
| 1.000                    | 1    | 9        | 1000 | 9.000      | 1.000.000  | ≈ 1,07 × 10³⁰¹ |

---

## 6. Complexidade de Espaço

- Usa a **mesma notação Big O**, mas medindo memória em vez de tempo.
- Exemplo: **mergesort** é O(n) em espaço (usa arrays auxiliares), enquanto **quicksort in-place** é O(log n).

---

## Resumo Final

1. **Complexidade de tempo**: quanto o tempo de execução cresce conforme a entrada aumenta.
2. **Complexidade de espaço**: quanto de memória o algoritmo consome.
3. **Notação Big O**: forma padrão de expressar esse crescimento.
4. **Ordem de eficiência**: O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ).
5. **Escolha do algoritmo**: quanto menor a complexidade, mais escalável a solução para grandes volumes de dados.