package control;

import model.Curso;
import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {

    public static void main(String[] args) {

        // Criar Curso
        Curso curso1 = new Curso("IBM0101", "ADS");
        Curso curso2 = new Curso("IBM0102", "CDIA");
        Curso curso3 = new Curso("IBM0103", "Engenharia de Software");
        Curso curso4 = new Curso("IBM0104", "Engenharia de Dados");


        // Criando Disciplina
        Disciplina poo = new Disciplina("IBM0500", "Prog OO", 80, curso1);
        Disciplina engDados = new Disciplina("IBM0512", "Engenharia de Dados", 80, curso4);
        Disciplina engSoft = new Disciplina("IBM0882", "Engenharia de Software", 80, curso3);
        Disciplina CDIA = new Disciplina("IBM0833", "CDIA", 80, curso2);
        Disciplina ArqComp = new Disciplina("IBM0834", "Arquitetura de Computadores", 80, curso1);


        // Criando Professores
        Professor profThiago = new Professor("123", "Thiago Souza", "Doutor");
        Professor profAnderson = new Professor("813", "Anderson Silva", "Mestre");
        Professor profTalita = new Professor("001", "Talita Vieira", "Doutora");
        Professor profClyton = new Professor("002", "Clyton Jones", "Mestrado");


        // add disciplina e professor a turmas
        Turma pooSemProf = new Turma("CDIA001", "Quinta", "14:00 a 18:00", "Sala 101", poo);
        Turma pooThiago = new Turma("CDIA002", "Quinta", "07:30 a 11:40", "Sala 201", profThiago, poo);
        Turma engDadosAnderson = new Turma("CDIA003", "Terça", "13:00 a 17:00", "Sala 301", profAnderson, engDados);
        Turma engSoftThiago = new Turma("CDIA004", "Quarta", "07:30 a 11:40", "Sala 401", profThiago, engSoft);
        Turma CDIAThiago = new Turma("CDIA005", "Segunda", "14:00 a 18:00", "Sala 501", profThiago, CDIA);
        Turma CDIAAnderson = new Turma("CDIA006", "Terça", "07:30 a 11:40", "Sala 601", profAnderson, CDIA);
        Turma ArqCompClython = new Turma("CDIA007", "Sexta", "13:00 a 17:00", "Sala 701", profClyton, ArqComp);




        // Add disciplina ao curso (duplo vinculo)
        curso1.addDisciplina(poo);
        curso1.addDisciplina(ArqComp);
        curso2.addDisciplina(CDIA);
        curso3.addDisciplina(engSoft);
        curso4.addDisciplina(engDados);


        // add professor a turma
        pooSemProf.setProfessor(profTalita);


        // add turmas ao professor
        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profThiago.addTurma(engSoftThiago);
        profTalita.addTurma(pooSemProf);
        profClyton.addTurma(ArqCompClython);

        // add disciplina ao professor
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
        // for (Turma turma : poo.getTurmas()) {
           // System.out.println(turma.getProfessor().getNome());
        //}

        System.out.println("-----------------------------------");

        // Quais professores ministram a disciplina POO?
        // OUTRA FORMA DE FAZER *

        listarProfsPoo(poo);  // *


        // Quais professores ministram aulas do curso de ADS
    }

        // faz parte da outra forma de fazer *
    public static void listarProfsPoo(Disciplina poo) {
        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }
    }

}

