package classesabstratas;

    public abstract class Veiculo {

    final int numeroRodasMinimo = 2;
    String placa;
    String chassi;

    abstract public String acelerar();     // Metodo abstrato

    public String frear(){
        return "Freando";
    }
}
