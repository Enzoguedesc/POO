package model;

import java.util.HashSet;

import java.util.Set;

public class Aluno {

    private String matricula;
    private String nome;
    private Set<Turma> turmas;  // um aluno pode estar matriculado em várias turmas

//  private Curso curso;     // um aluno pertence a um curso
//  private List<Disciplina> disciplinas;   // um aluno pode estar matriculado em várias disciplinas


    public Aluno(String matricula, String nome ) {  // Curso curso
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new HashSet<Turma>();  // HashSet para armazenar as turmas, sem duplicatas


//      this.curso = curso;
//      this.disciplinas = new ArrayList<>();  // Serve para armazenar as disciplinas
    }


    // Getters e Setters
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

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    // Add Turma e Remove Turma
    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public void removeTurma(Turma turma) {
        turmas.remove(turma);
    }



    //    public Curso getCurso() {
//        return curso;
//    }
//
//    public void setCurso(Curso curso) {
//        this.curso = curso;
//    }
//
//    public List<Disciplina> getDisciplinas() {
//        return disciplinas;
//    }
//
//    public void setDisciplinas(List<Disciplina> disciplinas) {
//        this.disciplinas = disciplinas;
//    }
}
