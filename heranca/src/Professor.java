public class Professor extends Pessoa {
    String titulacao;

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

}
