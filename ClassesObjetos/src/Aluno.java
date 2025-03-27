public class Aluno {

    String matricula, nome, curso;                             // Atributos da classe Aluno

    public Aluno(String matri, String name, String course) {    // Representação de metodo construtor
        this.matricula = matri;                                // this = quem ta recebendo quem
        this.nome = name;
        this.curso = course;
    }

    void trocaDeCurso(String novoCurso) {         // Não vai ter retorno.
        this.curso = novoCurso;
    }

    void trocarDeNome(String novoNome) {
        this.nome = novoNome;
    }
}
