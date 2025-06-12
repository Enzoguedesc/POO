package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Professor {

    private String matricula;
    private String nome;
    private String titulacao;
    private Set<Turma> turmas;  // O professor pode dar aula em varias turmas

    public Professor(String matricula, String nome, String titulacao) {
        this.turmas = new HashSet<Turma>();
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    // Dar aula em várias turmas
    // Adicionar turma e remover turma

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        turmas.remove(turma);
    }

}
