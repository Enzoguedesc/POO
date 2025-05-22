# POO

## Exercícios e teorias em JAVA  


### Abstração da OO  
- **Classe:** Molde para obejtos; Representação genérica das propriedades e comportamento de elementos de um conjunto.

- **Objeto:** Instância (ocorrencia especifica) de uma classe.

- **EX:** Enzo é um objeto dentro de classe de aluno.

- na ULM uma classe é representada em um retangulo com 3 compartimentos. 1 - Nome da classe, 2 - Atributos, 3 - Métodos

| UML        |    Exemplo     |
|-----------------|:--------------:|
| **Nome da Classe** |     Aluno     |
| **Atributos**     | - Matrícula<br>- Nome<br>- Curso |
| **Métodos**       | - TrocarDeCurso()<br>- MudarDeNome() |  


 O estado dos obejtos é definido nos atribustos da classe 

 
## Herança
- **Mecanismo da OO que possibilita a um subtipo aproveitar propriedades definidas em um supertipo.**

  Essas propriedades são: Métodos, Relacionamentos e Atributos  

- Uma maneira de promover reúso, porém é a pior maneira de promover reuso. Poís se vc for herdar de uma classe, você vai ter que herdar TUDO.  

## Hernaça em java
- Por meio da palavra reservada extends, uma subclasse pode herdar propriedades de uma superclasse.
  

![Relacionamento](https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/orientacaoobjetos/extends.png)  
UML: Generalização  
Java: Extends  


### Ex: 
```
public class Aluno  
    extends Pessoa {
    ...
}
```
- Em java não existe herança múltipla entre classes.

---

## 🧬 Vantagens da Herança (POO)
- aumento de produtividade

### 🔁 1. Reutilização de código

Você pode reutilizar código de uma **classe base (superclasse)** em **classes derivadas (subclasses)** sem precisar reescrever tudo.

> **Exemplo:** Se você tem uma classe `Animal` com o método `comer()`, todas as subclasses como `Cachorro`, `Gato`, etc., herdam esse comportamento.

---

### 🧱 2. Organização e estrutura

Ajuda a organizar o código de forma mais **hierárquica** e **modular**. Fica mais fácil entender a relação entre os componentes do sistema.

> **Exemplo:** `Veículo` → `Carro`, `Moto`, `Caminhão`

---

### 🔄 3. Facilidade de manutenção

Alterações feitas na superclasse afetam todas as subclasses, tornando o código mais fácil de manter e atualizar.

---

### 🧬 4. Polimorfismo

Permite que você trate objetos de subclasses como objetos da superclasse, facilitando o uso de **polimorfismo**.

```java
Animal a = new Cachorro();
a.emitirSom();  // Pode chamar o som específico do Cachorro
```
---

### 📦 5. Redução de redundância

Você evita repetir atributos e métodos comuns em várias classes, centralizando-os na superclasse.  

---

## Encapsulamento
Capacidade de um objeto restringir o acesso a determinadas propriedades.  
Em Java, é realizado por meio de modificadores de visibilidade.

### Modificadores de visibilidade:
  - **public (+):** A propriedade pode ser acessada por objetos de quaisquer classes do mesmo projeto.
  - **private (-):** A propriedade pode ser acessada apenas por quaisquer objetos da mesma classe.
  - **protected (#):** A propriedade pode ser acessada por:  
1)Objetos de quaisquer classes do mesmo pacote ou;  
2)Por suas superclasses desde que a propriedade tenha sido declarada na propria superclasse.
  - **"package" ( ):** A propriedade pode ser acessada apenas por objetos dentro do mesmo pacote.

>A visibilidade de uma propriedade interfere na herança?  
**SIM**, por conta dos modificadores de visibilidade (public, private, protected, package)

### Getters e Setters:
- Getters (obtém) e Setters (define) permitem acessar e modificar os atributos privados de uma classe.
- Getters retornam o valor do atributo
- Setters definem o valor do atributo.

---

## 🔷 Monolito

- Um **monolito** é uma arquitetura de software onde todos os componentes da aplicação (interface, lógica de negócio e acesso a dados) estão agrupados em uma única base de código e executados como um único processo.
- Frequentemente, o monolito é implementado em uma **única classe ou projeto** que concentra todas as funcionalidades da aplicação.

### Problemas Comuns:
- **Baixa escalabilidade:** difícil isolar partes específicas para escalar independentemente.
- **Dificuldade de manutenção:** alterações em uma parte do sistema podem afetar outras partes inesperadamente.
- **Complexidade crescente:** à medida que o projeto cresce, torna-se mais difícil de entender, testar e evoluir.

> 💡 **Separação de responsabilidades (SoC)** é frequentemente desrespeitada em monolitos, já que diversas responsabilidades estão misturadas em um mesmo bloco de código. Isso gera forte **acoplamento** e baixa **coesão**.

---

## 🧱 Arquitetura MVC (Model-View-Controller)

A arquitetura **MVC** organiza o código da aplicação separando interesses e reponsabilidades.

### Componentes:

- **View (Visão):**
  - Responsável pela **interface com o usuário**.
  - Pode ser gráfica (GUI), textual (CLI) ou web (HTML/CSS).
  - Mostra os dados do `Model` e envia interações do usuário para o `Controller`.

- **Controller (Controlador):**
  - Atua como **intermediário** entre a View e o Model.
  - Contém a **lógica de negócio**, processando requisições e definindo o que deve ser exibido ou armazenado.
  - _Exemplo: lógica de cálculo de desconto em uma compra._

- **Model (Modelo):**
  - Representa os **dados** da aplicação e suas regras de persistência.
  - É responsável por interagir com o **banco de dados**.
  - _Exemplo: uma classe `Produto` que representa a tabela de produtos no banco._
  - **Entidade de domínio**.

  
### ✅ Vantagens do MVC

- **Baixo Acoplamento:**
  - Cada camada é **independente**, permitindo alterações sem grandes impactos nas outras partes.

- **Alta Coesão:**
  - Cada módulo tem uma responsabilidade bem definida.
  - O código é mais **organizado**, **modular** e **reutilizável**.

- **Facilidade de Testes:**
  - É possível testar lógica de negócio (Controller e Model) sem depender da interface (View).

- **Melhor Manutenção e Escalabilidade:**
  - Adicionar funcionalidades ou corrigir erros se torna mais simples e seguro.

## Polimorfismo

Ele permite que métodos com o mesmo nome possam se comportar de maneiras diferentes, dependendo do contexto em que são utilizados.

Em Java, o polimorfismo se divide em dois tipos principais:

### Tipos de Polimorfismo

- **Polimorfismo de compilação (sobrecarga de métodos):**  
  Ocorre quando há múltiplos métodos com o mesmo nome, mas com assinaturas diferentes (quantidade ou tipo de parâmetros). A escolha de qual método será chamado é feita durante a compilação.

- **Polimorfismo de tempo de execução (sobrescrita de métodos):**  
  Também chamado de *late binding*, ocorre quando uma subclasse fornece uma implementação específica para um método já definido em sua superclasse. A escolha de qual método será executado acontece em tempo de execução, com base no tipo real do objeto.

### Sobrecarga vs. Sobrescrita

- **Sobrecarga de métodos (`overloading`):**  
  Permite definir múltiplos métodos com o mesmo nome em uma mesma classe, desde que possuam assinaturas diferentes. É usada para aumentar a flexibilidade e a legibilidade do código.

- **Sobrescrita de métodos (`overriding`):**  
  Permite redefinir um método de uma superclasse em uma subclasse, mantendo a assinatura do método original. É usada para implementar a herança e a polimorfismo.  

### 🧬 Vantagens do Polimorfismo

- **Flexibilidade:** Permite adicionar novos comportamentos sem alterar a estrutura existente.

- **Flexibilidade de Extensibilidade:** Permite adicionar novos tipos de objetos sem alterar a estrutura existente.

- **Flexibilidade de Manutenção:** Permite adicionar novos comportamentos sem alterar a estrutura existente.

- **Flexibilidade de Escalabilidade:** Permite adicionar novos tipos de objetos sem alterar a estrutura existente.

- **Flexibilidade de Testes:** Permite adicionar novos comportamentos sem alterar a estrutura existente.

- **Flexibilidade de Reutilização:** Permite adicionar novos comportamentos sem alterar a estrutura existente.

## Classes Abstratas
- Em Java, classes abstratas são classes que não podem ser instanciadas diretamente e que servem como modelo base para outras classes. Elas são utilizadas quando você quer definir uma estrutura comum para um conjunto de classes relacionadas, mas deixando alguns comportamentos para serem implementados pelas subclasses.
 
- **Regrinha:** uma classe abstrata não precisa ter métodos abstratos; mas se a classe tiver pelo menos um método abstrato, obrigatoriamente ela deve ser declarada como abstrata.


### Características principais

- Não pode ser instanciada:

```Animal a = new Animal(); // ERRO! Classe abstrata não pode ser instanciada```

- Pode conter métodos abstratos e concretos:

  - Métodos abstratos não têm corpo e devem ser implementados nas subclasses.

  - Métodos concretos podem ter implementação comum para todas as subclasses.

- Serve como base para herança:

```
public class Cachorro extends Animal {
@Override
public void fazerSom() {
System.out.println("Au au!");
  }
}
```
- Pode ter atributos e construtores:

  - Embora não possa ser instanciada, a classe abstrata pode ter construtores que serão chamados pelas subclasses através do super.


## Interfaces

- Uma interface em Java representa um contrato de comportamento, definindo um conjunto de métodos que devem ser implementados pelas classes que a implementarem.

![Interfaces](https://miro.medium.com/v2/resize:fit:1180/1*qNMQnjs0G7pl8ImCyj6MhA.jpeg)  
UML: Realização  
Java: Implements  


**`final` na declaração da classe:**
- Evita que a classe seja herdada.

**`final` na declaração de um método:**

- Evita que o metodo seja sobreescrito.

**`final`na declaração de uma variável:**

- Evita que a variável seja modificada.

**OBS:** não faz sentido usar o `final` onde se usa `abstract`.