package interfaces;

public interface Veiculo {

    // final é usada para declarar uma constante e não pode ser alterada em tempo de execução

    final int numeroRodasMinimo = 2;


    public String acelerar();
    public String frear();
}
