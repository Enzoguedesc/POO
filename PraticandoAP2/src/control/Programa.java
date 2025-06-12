package control;

import model.*;

import java.util.HashSet;
import java.util.Set;


public class Programa {

    public static void main(String[] args) {


        // Criar Curso
        Curso cursoADS = new Curso("1234", "Analise e Desenvolvimento de Sistemas");
        Curso cursoCDIA = new Curso("1035", "Ciencia da Dados");
        Curso cursoECO = new Curso("3036", "Economia");
        Curso cursoARQT = new Curso("4037", "Arquitetura");

        // Criar Disciplina (add um curso, pois uma disciplina pertence a um curso)
        Disciplina POO = new Disciplina("PROG123", "Programacao Orientada a Objetos", 80, cursoADS);
        Disciplina PPS = new Disciplina("PROG234", "Programacao para Sistemas", 80, cursoADS);
        Disciplina BD = new Disciplina("PROG932", "Banco de Dados", 80, cursoCDIA);
        Disciplina Estatistica = new Disciplina("PROG345", "Estatistica", 80, cursoCDIA);
        Disciplina Micro = new Disciplina("ECON123", "Microeconomia", 80, cursoECO);
        Disciplina Geometria = new Disciplina("ARQT123", "Geometria Analitica", 80, cursoARQT);
        Disciplina Calculo = new Disciplina("ARQT234", "Calculo", 80, cursoARQT);

        // Criar Professor
        Professor profThiago = new Professor("001", "Thaigo", "Doutor");
        Professor profAnderson = new Professor("002", "Anderson", "Doutor");
        Professor profJonh = new Professor("003", "John", "Mestre");
        Professor profRafael = new Professor("004", "Rafael", "Mestre");
        Professor profTalita = new Professor("005", "Talita", "Doutor");

        // Criar Aluno
        Aluno alunoEnzo = new Aluno("2002", "Enzo Guedes");
        Aluno alunoBruna = new Aluno("3482", "Bruna Guerra");
        Aluno alunoGabriel = new Aluno("7965", "Gabriel Guerra");
        Aluno alunoJoao = new Aluno("1234", "Joao Guerra");
        Aluno alunoPedro = new Aluno("5678", "Pedro Guerra");

        // Criar Turma (add disciplina e professor, pois uma turma tem uma disciplina e um professor)
        Turma turma1PooThiago = new Turma("2324", "Segunda", "07:00", "Sala 01", POO, profThiago);
        Turma turma2PpsThiago = new Turma("3259", "Terca", "08:00", "Sala 02", PPS, profThiago);
        Turma turma3BdAnderson = new Turma("1234", "Quarta", "12:00", "Sala 03", BD, profAnderson);
        Turma turma4EstaAnderson = new Turma("2345", "Quinta", "13:00", "Sala 04", Estatistica, profAnderson);
        Turma turma5MicroJonh = new Turma("3456", "Sexta", "14:00", "Sala 05", Micro, profJonh);
        Turma turma6GeoRafael = new Turma("5678", "Quarta", "16:00", "Sala 07", Geometria, profRafael);
        Turma turma7CalcTalita = new Turma("6789", "Quinta", "17:00", "Sala 08", Calculo, profTalita);

        // Turma sem professor
        Turma turmaSemProf = new Turma("7890", "Sabado", "10:00", "Sala 12", POO);


        // Associacões

        // Add Turma em Professor
        profAnderson.addTurma(turma3BdAnderson);
        profJonh.addTurma(turma5MicroJonh);
        profRafael.addTurma(turma6GeoRafael);
        profThiago.addTurma(turma1PooThiago);

        // Add Professor em Turma
        turmaSemProf.setProfessor(profTalita);


        // Add Turma em Disciplina
        POO.addTurma(turma1PooThiago);
        PPS.addTurma(turma2PpsThiago);
        BD.addTurma(turma3BdAnderson);
        Estatistica.addTurma(turma4EstaAnderson);
        Micro.addTurma(turma5MicroJonh);
        Geometria.addTurma(turma6GeoRafael);


        // Add Turma em Alunos
        alunoEnzo.addTurma(turma1PooThiago);
        alunoGabriel.addTurma(turma3BdAnderson);
        alunoBruna.addTurma(turma7CalcTalita);
        alunoJoao.addTurma(turma4EstaAnderson);

        // Add Aluno em Turma
        turma1PooThiago.addAluno(alunoEnzo);
        turma3BdAnderson.addAluno(alunoBruna);
        turma2PpsThiago.addAluno(alunoGabriel);
        turma5MicroJonh.addAluno(alunoJoao);
        turma4EstaAnderson.addAluno(alunoPedro);
        turma7CalcTalita.addAluno(alunoBruna);


        // Add Disciplina em Curso
        cursoCDIA.addDisciplina(POO);
        cursoCDIA.addDisciplina(PPS);
        cursoADS.addDisciplina(BD);
        cursoCDIA.addDisciplina(Estatistica);
        cursoECO.addDisciplina(Micro);

        // Add Professor em Disciplina
        POO.addTurma(turma1PooThiago);
        PPS.addTurma(turma2PpsThiago);
        BD.addTurma(turma3BdAnderson);
        Estatistica.addTurma(turma4EstaAnderson);
        Micro.addTurma(turma5MicroJonh);
        Geometria.addTurma(turma6GeoRafael);

        // Add Disciplina em Professor
        profAnderson.addTurma(turma3BdAnderson);
        profJonh.addTurma(turma5MicroJonh);
        profRafael.addTurma(turma6GeoRafael);
        profThiago.addTurma(turma1PooThiago);



        System.out.println("------ Profs de POO ------");


        // Quais professores ministram a disciplina POO?
        for (Turma turma : POO.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }


        System.out.println("------ Prof na turma sem Prof ------");


        // Nome do professor que foi alocado para a turma sem professor?
        System.out.println(turmaSemProf.getProfessor().getNome());


        System.out.println("------ Turmas do Prof Anderson ------");


        // Quais turmas, o Professor Anderson ministra?
        for(Turma turma : profAnderson.getTurmas()) {
            System.out.println("Código da Turma: " + turma.getCodigo());
        }


        System.out.println("------ Disciplinas do Prof Thiago ------");


        // Quais disciplinas o professor Thiago ministra?
        for (Turma turma : profThiago.getTurmas()) {
            System.out.println(turma.getDisciplina().getNome());
        }


        System.out.println("------ Disciplinas do Curso CDIA ------");


        // Quais disciplinas tem o curso de CDIA?
        for (Disciplina disciplina : cursoCDIA.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }


        System.out.println("------ Turma do Aluno Enzo ------");


        // Quais turmas o Enzo está alocado?
        for (Turma turma : alunoEnzo.getTurmas()) {
            System.out.println("Código da turma: " + turma.getCodigo());
        }


        System.out.println("------ Alunos de POO ------");


        // Quais alunos estao na turma de POO?
        for (Aluno aluno : turma1PooThiago.getAlunos()) {
            System.out.println(aluno.getNome());
        }


        System.out.println("------ Prof   ------");


        // Quais professores ministram as diciplinas do curso de cursoADS?
        Set<Professor> professoresCursoADS = new HashSet<>();

        for (Disciplina disciplina : cursoADS.getDisciplinas()) {
            for (Turma turma : disciplina.getTurmas()) {
                Professor professor = turma.getProfessor();
                if (professor != null) {
                    professoresCursoADS.add(professor);
                }
            }
        }
        for (Professor professor : professoresCursoADS) {
            System.out.println(professor.getNome());
        }
    }
}
