package model;

public class Pessoa {
    private String nome;
    private String telefone;

    // Metodo construtor padrao (vazio e sem parametros).
    // Um metodo construtor é responsavel por instanciar um objeto,
    // realizando atribuicoes de valores aos seus atributos e alocando o objeto na memoria.

    public Pessoa(){   // nao possui indicador de retorno

    }

    public  Pessoa(String nome){
        this.nome = nome;
    }

    public  Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void mudarTelefone(String telefone){  // possui indicador de retorno, mas nao possui retorno (void)
        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
