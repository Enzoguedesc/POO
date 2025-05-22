package classesabstratas;

public class Carro extends Veiculo {

    // Implementacao do metodo concreto acelerar() definido na superclasse
    public String acelerar(){
        return "Acelerando o carro";
    }


    // Sobrescrita do metodo concreto frear() definido na superclasse
    @Override                   // Override só no metodo sobrecrito
    public String frear(){
        return "Freando o carro";
    }
}
