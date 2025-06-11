package control;

import model.Curso;
import model.Disciplina;
import model.Professor;
import model.Turma;


public class Programa {

    public static void main(String[] args) {


        // Criar Curso
        Curso cursoADS = new Curso("1234", "Analise e Desenvolvimento de Sistemas");
        Curso cursoCDIA = new Curso("1035", "Ciencia da Dados");
        Curso cursoECO = new Curso("3036", "Economia");
        Curso cursoARQT = new Curso("4037", "Arquitetura");

        // Criar Disciplina
        Disciplina POO = new Disciplina("PROG123", "Programacao Orientada a Objetos", 80, cursoADS);
        Disciplina PPS = new Disciplina("PROG234", "Programacao para Sistemas", 80, cursoADS);
        Disciplina BD = new Disciplina("PROG932", "Banco de Dados", 80, cursoCDIA);
        Disciplina Estatistica = new Disciplina("PROG345", "Estatistica", 80, cursoCDIA);
        Disciplina Micro = new Disciplina("ECON123", "Microeconomia", 80, cursoECO);
        Disciplina Macro = new Disciplina("ECON234", "Macroeconomia", 80, cursoECO);
        Disciplina Geometria = new Disciplina("ARQT123", "Geometria Analitica", 80, cursoARQT);
        Disciplina Calculo = new Disciplina("ARQT234", "Calculo", 80, cursoARQT);

        // Criar Professor
        Professor profThiago = new Professor("001", "Thaigo", "Doutor");
        Professor profAnderson = new Professor("002", "Anderson", "Doutor");
        Professor profJonh = new Professor("003", "John", "Mestre");
        Professor profRafael = new Professor("004", "Rafael", "Mestre");
        Professor profTalita = new Professor("005", "Talita", "Doutor");

        // Criar Turma (add disciplina e professor)
        Turma turma01 = new Turma("2324", "Segunda", "07:00", "Sala 01", POO, profThiago);
        Turma turma02 = new Turma("3259", "Terca", "08:00", "Sala 02", PPS, profThiago);
        Turma turma03 = new Turma("1234", "Quarta", "12:00", "Sala 03", BD, profAnderson);
        Turma turma04 = new Turma("2345", "Quinta", "13:00", "Sala 04", Estatistica, profAnderson);
        Turma turma05 = new Turma("3456", "Sexta", "14:00", "Sala 05", Micro, profJonh);
        Turma turma06 = new Turma("4567", "Sexta", "17:00", "Sala 06", Macro, profJonh);
        Turma turma07 = new Turma("5678", "Quarta", "16:00", "Sala 07", Geometria, profRafael);
        Turma turma08 = new Turma("6789", "Segunda", "17:00", "Sala 08", Calculo, profRafael);
        Turma turma09 = new Turma("7890", "Terca", "18:00", "Sala 09", Geometria, profTalita);

        Turma turmaSemProf = new Turma("7890", "Sabado", "10:00", "Sala 12", POO);

        

    }
}
