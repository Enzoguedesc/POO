package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {

    public static void main(String[] args) {

        Disciplina poo = new Disciplina("IBM0500", "Prog OO", 80);
        Disciplina engDados = new Disciplina("IBM0512", "Engenharia de Dados", 80);
        Disciplina engSoft = new Disciplina("IBM0882", "Engenharia de Software", 80);

        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("813", "Anderson Silva", "Mestre");
        Professor profTalita = new Professor("001", "Talita Vieira", "Doutora");

        // add disciplina e professor a turmas
        Turma pooSemProf = new Turma("CDIA001", "Quinta", "14:00 a 18:00", "Sala 101", poo);
        Turma pooThiago = new Turma("CDIA002", "Quinta", "07:30 a 11:40", "Sala 201", profThiago, poo);
        Turma engDadosAnderson = new Turma("CDIA003", "Terça", "13:00 a 17:00", "Sala 301", profAnderson, engDados);
        Turma engSoftThiago = new Turma("CDIA004", "Quarta", "07:30 a 11:40", "Sala 401", profThiago, engSoft);

        //
        pooSemProf.setProfessor(profTalita);

        // add turmas ao professor
        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profThiago.addTurma(engSoftThiago);
        profTalita.addTurma(pooSemProf);

        poo.addTurma(pooThiago);
        poo.addTurma(pooSemProf);

        System.out.println(pooThiago.getProfessor().getNome());

        System.out.println("-----------------------------------");

        // Quais as diciplinas de um determinado professor?
        for (Turma turma : profThiago.getTurmas()) {
            System.out.println(turma.getDisciplina().getNome());
        }

        System.out.println("-----------------------------------");

        // Quais professores ministram a disciplina POO?
        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }

    }
}
