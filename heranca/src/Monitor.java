public class Monitor extends Aluno{
    Double percentualBolsa;

    public Monitor(){

    }

    public Monitor(String nome, String telefone,String matricula, Double percentualBolsa){
        super(nome, telefone, matricula);
        this.percentualBolsa = percentualBolsa;
    }
}
