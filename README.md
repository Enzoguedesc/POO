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

- Uma maneira de promover reúso, porém é a pior maneira de promover reuso.

## Hernaça em java
- Por meio da palavra reservada extends, uma subclasse pode herdar propriedades de uma superclasse.

- Ex: 
public class Aluno 
    extends Pessoa {
    ...
}

- Em java não existe herança múltipla entre classes.