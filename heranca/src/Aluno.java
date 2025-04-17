public class Aluno extends Pessoa{
    String matricula;
    String nome;
    String telefone;

    public void mudarTelefone(String telefone){
        this.telefone = telefone;
    }
    public void mudarNome(String nome){
        this.nome = nome;
    }
    public void mudarMatricula(String matricula){
        this.matricula = matricula;
    }


}
