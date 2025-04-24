public class Programa {
    public static void main(String[] args) {

        // Pessoa
        // Pessoa() é o metodo construtur que tem o mesmo nome da classe. toda classe em java tem um metodo construtor cheio ou vazio
        Pessoa p1 = new Pessoa();
        p1.nome = ("Enzo");
        p1.telefone = ("1234-1234");
        System.out.println("Telefone: " + p1.telefone);
        p1.mudarTelefone("999999999");
        System.out.println("Telefone: " + p1.telefone);

        Pessoa p2 = new Pessoa("Maria", "2443555464");
        System.out.println("Nome P2: " + p2.nome);
        System.out.println("Telefone P2: " + p2.telefone);

        // Passando apenas um só parametro
        Pessoa p3 = new Pessoa("Ana");


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

        Aluno a2 = new Aluno("Roberto", "98764234567", "7777");
        System.out.println("Nome a2: " + a2.nome);
        System.out.println("Telefone a2: " + a2.telefone);
        System.out.println("Matricula a2: " + a2.matricula);


        System.out.println("---------------------------");

        // Professor
        Professor prof1 = new Professor();
        prof1.titulacao = ("Doutor");
        System.out.println("Titulacao: " + prof1.titulacao);
        prof1.mudarTitulacao("Mestre");
        System.out.println("Titulacao: " + prof1.titulacao);

        Professor prof2 = new Professor("Joao", "3423452353", "Doutor");
        System.out.println("Nome prof2: " + prof2.nome);
        System.out.println("Telefone prof2: " + prof2.telefone);
        System.out.println("Titulacao prof2: " + prof2.titulacao);

        System.out.println("---------------------------");

        // Monitor
        Monitor mon1 = new Monitor();
        mon1.matricula = ("9999");
        System.out.println("Matricula: " + mon1.matricula);
        mon1.percentualBolsa = 10.0;
        System.out.println("Percentual de bolsa: " + mon1.percentualBolsa);

        Monitor mon2 = new Monitor("Pedro", "1234-1234", "9999", 20.0);
        System.out.println("Nome mon2: " + mon2.nome);
        System.out.println("Telefone mon2: " + mon2.telefone);
        System.out.println("Matricula mon2: " + mon2.matricula);
        System.out.println("Percentual de bolsa mon2: " + mon2.percentualBolsa);

        System.out.println("---------------------------");
    }
}
