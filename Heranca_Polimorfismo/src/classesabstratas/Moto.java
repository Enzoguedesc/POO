package classesabstratas;

public class Moto extends Veiculo {

    // Implementacao do metodo concreto acelerar() definido na superclasse
    public String acelerar(){
        return "Acelerando a moto";
    }

    // Sobrescrita do metodo concreto frear() definido na superclasse
    @Override                         // Override só no metodo sobrecrito
    public String frear(){
        return "Freando a moto";
    }
}
