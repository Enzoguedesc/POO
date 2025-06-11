package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String matricula;
    private String nome;
    private Curso curso;     // um aluno pertence a um curso
    private List<Disciplina> disciplinas;   // um aluno pode estar matriculado em várias disciplinas

    public Aluno(String matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.disciplinas = new ArrayList<>();  // Serve para armazenar as disciplinas
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
