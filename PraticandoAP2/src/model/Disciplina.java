package model;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {

    private String codigo;
    private String nome;
    private int cargaHoraria;
    private Set<Turma> turmas;  // Turmas da disciplina
    private Curso curso;  // Curso que a disciplina pertence

    public Disciplina(String codigo, String nome, int cargaHoraria, Curso curso) {
        this.turmas = new HashSet<Turma>();  // HashSet para armazenar as turmas
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
