
# Respostas para as Questões

## 3) Lógica do trecho de código:

O código acumula a soma de valores de `K` enquanto `K` é menor que o valor de `INDICE`. Quando o código terminar, a variável `SOMA` terá o valor resultante da soma de números de 2 a 12, pois o `K` começa em 1 e é incrementado antes de ser somado a `SOMA`. A operação seria:

```
K: 2  3  4  5  6  7  8  9 10 11 12
SOMA: 2  5  9 14 20 27 35 44 54 65 77
```

Então, o valor final de `SOMA` será **77**.

---

## 4) Complete o próximo elemento:

- a) **1, 3, 5, 7, 9**
  - Lógica: sequência de números ímpares.
  
- b) **2, 4, 8, 16, 32, 64, 128**
  - Lógica: cada número é o dobro do anterior.
  
- c) **0, 1, 4, 9, 16, 25, 36, 49**
  - Lógica: sequência de quadrados perfeitos (0², 1², 2², ...).
  
- d) **4, 16, 36, 64, 100**
  - Lógica: sequência de quadrados perfeitos, mas começando em 2² (2², 4², 6², 8², 10²).
  
- e) **1, 1, 2, 3, 5, 8, 13**
  - Lógica: sequência de Fibonacci (cada número é a soma dos dois anteriores).
  
- f) **2, 10, 12, 16, 17, 18, 19, 20**
  - Lógica: após 10, a sequência continua somando 1 exceto em múltiplos de 10, onde o incremento é maior.

---

## 5) Descobrir qual interruptor controla cada lâmpada:

1. **Ligaria o primeiro interruptor e deixe-o ligado por alguns minutos.**
2. **Depois desligaria o primeiro interruptor e ligue o segundo interruptor.**
3. Iria até a sala das lâmpadas:
   - A lâmpada que estivesse **acesa** está conectada ao **segundo interruptor**.
   - A lâmpada que estivesse **quente** (mas apagada) está conectada ao **primeiro interruptor**.
   - A lâmpada que estivesse **fria e apagada** está conectada ao **terceiro interruptor**.
