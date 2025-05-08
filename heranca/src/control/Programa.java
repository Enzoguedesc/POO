package control;

import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {
    public static void main(String[] args) {

        // model.Pessoa
        // model.Pessoa() é o metodo construtur que tem o mesmo nome da classe. toda classe em java tem um metodo construtor cheio ou vazio
        Pessoa p1 = new Pessoa();
        p1.setNome("Enzo");
        p1.setTelefone("1234-1234");
        System.out.println("Telefone: " + p1.getTelefone());
        p1.mudarTelefone("999999999");
        System.out.println("Telefone: " + p1.getTelefone());

        Pessoa p2 = new Pessoa("Maria", "2443555464");
        System.out.println("Nome P2: " + p2.getNome());
        System.out.println("Telefone P2: " + p2.getTelefone());

        // Passando apenas um só parametro
        Pessoa p3 = new Pessoa("Ana");


        System.out.println("---------------------------");


        // model.Aluno
        Aluno a1 = new Aluno();
        a1.setMatricula("1111");
        a1.setNome("Joao");
        a1.setTelefone("1234-1234");
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Telefone: " + a1.getTelefone());

        a1.mudarTelefone("999999999");
        a1.mudarNome("Pedro");
        a1.mudarMatricula("666666");

        System.out.println("Telefone: " + a1.getTelefone());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Matricula: " + a1.getMatricula());

        Aluno a2 = new Aluno("Roberto", "98764234567", "7777");
        System.out.println("Nome a2: " + a2.getNome());
        System.out.println("Telefone a2: " + a2.getTelefone());
        System.out.println("Matricula a2: " + a2.getMatricula());


        System.out.println("---------------------------");

        // model.Professor
        Professor prof1 = new Professor();
        prof1.setTitulacao("Doutor");
        System.out.println("Titulacao: " + prof1.getTitulacao());
        prof1.mudarTitulacao("Mestre");
        System.out.println("Titulacao: " + prof1.getTitulacao());

        // usando o metodo construtor. Usado para definir atributos obrigatorios.
        Professor prof2 = new Professor("Joao", "3423452353", "Doutor");
        System.out.println("Nome prof2: " + prof2.getNome());
        System.out.println("Telefone prof2: " + prof2.getTelefone());
        System.out.println("Titulacao prof2: " + prof2.getTitulacao());

        // mudando de nome com o metodo SET
        prof2.setNome("Pedro");
        System.out.println("Novo nome:" + prof2.getNome());

        System.out.println("---------------------------");

        // model.Monitor
        Monitor mon1 = new Monitor();
        mon1.setNome("Joao");
        mon1.setTelefone("1234-1234");
        mon1.setMatricula("1111");
        System.out.println("Matricula: " + mon1.getMatricula());
        // mon1.percentualBolsa = 10.0; atribuicao direta
        mon1.setPercentualBolsa(30.0); // atribuicao indireta
        System.out.println("Percentual de bolsa: " + mon1.getPercentualBolsa());

        Monitor mon2 = new Monitor("Pedro", "1234-1234", "9999", 30.0);
        System.out.println("Percentual de bolsa: " + mon2.getPercentualBolsa());
        mon2.setPercentualBolsa(40.0);
        System.out.println(mon2.getPercentualBolsa());

        System.out.println("---------------------------");
    }
}
