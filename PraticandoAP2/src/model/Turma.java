package model;

public class Turma {

    private String codigo;
    private String diaDaSemana;
    private String horario;
    private String sala;
    private Disciplina disciplina;  // Disciplina que a turma pertence
    private Professor professor;  // Professor que ministra a turma

    // Turma com professor
    public Turma(String codigo, String diaDaSemana, String horario, String sala, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    // Turma sem professor
    public Turma(String codigo, String diaDaSemana, String horario, String sala, Disciplina disciplina) {
        this.codigo = codigo;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
