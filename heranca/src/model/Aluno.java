package model;

public class Aluno extends Pessoa {
    String nome;
    String telefone;
    String matricula;

    public void mudarTelefone(String telefone){
        this.telefone = telefone;
    }
    public void mudarNome(String nome){
        this.nome = nome;
    }
    public void mudarMatricula(String matricula){
        this.matricula = matricula;
    }

    public Aluno(String nome, String telefone, String matricula){
        super(nome, telefone);
        this.matricula = matricula;
    }

    public Aluno(){

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
