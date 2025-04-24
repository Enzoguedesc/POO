package model;

public class Professor extends Pessoa {
    private String nome;
    private String telefone;
    private String titulacao;


    public Professor(String nome,String telefone, String titulacao){
        // a claúsula super() repassa os parâmetros exigidos pelo construtor da superclasse
        super(nome, telefone);
        this.titulacao = titulacao;
    }

    public Professor(){

    }

    public void mudarTitulacao(String titulacao){
        this.titulacao = titulacao;
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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
