# 📘 02J - Atividade 02

Este projeto contém a implementação de três classes em Java: `Produto`, `ContaBancaria` e `Circulo`. Cada classe representa um conceito básico de programação orientada a objetos e é acompanhada de um programa de teste no método `main`.

---

## 🛍️ Exercício 01 - Classe Produto

### Objetivo:
Criar uma classe `Produto` que representa um item em estoque.

### Atributos:
- `nome` (String): Nome do produto
- `preco` (double): Preço unitário do produto
- `quantidade` (int): Quantidade em estoque

### Métodos:
- `Produto(String nome, double preco, int quantidade)`: Construtor
- `double calcularValorTotal()`: Retorna o valor total do estoque (`preco * quantidade`)
- `void aplicarDesconto(double percentual)`: Aplica desconto sobre o preço

### Testes:
- Criar um objeto `Produto`
- Aplicar desconto
- Exibir as informações atualizadas do produto

---

## 🏦 Exercício 02 - Classe ContaBancaria

### Objetivo:
Modelar uma conta bancária com operações básicas.

### Atributos:
- `numeroConta` (String): Número da conta
- `titular` (String): Nome do titular
- `saldo` (double): Saldo atual da conta

### Métodos:
- `ContaBancaria(String numeroConta, String titular, double saldo)`: Construtor
- `void depositar(double valor)`: Realiza um depósito
- `void sacar(double valor)`: Realiza um saque, se houver saldo suficiente
- `void exibirSaldo()`: Imprime o saldo atual

### Testes:
- Criar uma conta
- Realizar depósito
- Realizar saque
- Exibir saldo final

---

## ⚪ Exercício 03 - Classe Circulo

### Objetivo:
Criar uma classe que represente um círculo.

### Atributo:
- `raio` (double): Raio do círculo

### Métodos:
- `Circulo(double raio)`: Construtor
- `double calcularArea()`: Retorna a área do círculo
- `double calcularPerimetro()`: Retorna o perímetro do círculo

> Fórmulas:
> - Área: π × raio²
> - Perímetro: 2 × π × raio
> - Use `Math.PI` para π

### Testes:
- Criar um objeto `Circulo`
- Exibir área e perímetro calculados

