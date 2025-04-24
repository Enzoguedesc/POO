# POO

## Exercícios e teorias em JAVA  


### Abstração da OO  
- **Classe:** Molde para obejtos; Representação genérica das propriedades e comportamento de elementos de um conjunto.

- **Objeto:** Instância (ocorrencia especifica) de uma classe.

- **EX:** Enzo é um objeto dentro de classe de aluno.

- na ULM uma classe é representada em um retangulo com 3 compartimentos. 1 - Nome da classe, 2 - Atributos, 3 - Métodos

| UML        | Exemplo        |
|-----------------|----------------|
| **Nome da Classe** | Aluno         |
| **Atributos**     | - Matrícula<br>- Nome<br>- Curso |
| **Métodos**       | - TrocarDeCurso()<br>- MudarDeNome() |  


 O estado dos obejtos é definido nos atribustos da classe 

 
## Herança
- Mecanismo da OO que possibilita a um subtipo aproveitar propriedades definidas em um supertipo.

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



