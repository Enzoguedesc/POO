package model;

import java.util.HashSet;
import java.util.Set;

public class Curso {

    private String codigo;
    private String nome;

    private Set<Disciplina> disciplinas;


    public Curso(String codigo, String nome) {   // Mé́todo construtor
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new HashSet<Disciplina>();
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


    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
}
