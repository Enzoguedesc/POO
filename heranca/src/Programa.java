public class Programa {
    public static void main(String[] args) {

        // Pessoa
        Pessoa p1 = new Pessoa();    // Pessoa() é o construtur que tem o mesmo nome da classe
        p1.nome = ("Enzo");
        p1.telefone = ("1234-1234");
        System.out.println("Telefone: " + p1.telefone);
        p1.mudarTelefone("999999999");
        System.out.println("Telefone: " + p1.telefone);


        System.out.println("---------------------------");

        // Aluno
        Aluno a1 = new Aluno();
        a1.matricula = ("1234");
        a1.nome = ("Joao");
        a1.telefone = ("1234-1234");
        System.out.println("Matricula: " + a1.matricula);
        System.out.println("Nome: " + a1.nome);
        System.out.println("Telefone: " + a1.telefone);

        a1.mudarTelefone("999999999");
        a1.mudarNome("Pedro");
        a1.mudarMatricula("666666");

        System.out.println("Telefone: " + a1.telefone);
        System.out.println("Nome: " + a1.nome);
        System.out.println("Matricula: " + a1.matricula);

        System.out.println("---------------------------");

        // Professor
        Professor prof1 = new Professor();
        prof1.titulacao = ("Doutor");
        System.out.println("Titulacao: " + prof1.titulacao);
        prof1.mudarTitulacao("Mestre");
        System.out.println("Titulacao: " + prof1.titulacao);

        System.out.println("---------------------------");

        // Monitor
        Monitor mon1 = new Monitor();
        mon1.matricula = ("9999");
        System.out.println("Matricula: " + mon1.matricula);
        mon1.percentualBolsa = 10.0;
        System.out.println("Percentual de bolsa: " + mon1.percentualBolsa);

        System.out.println("---------------------------");
    }
}
