import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("01", "Enzo", "CDIA");
        Aluno aluno2 = new Aluno("02", "Bruna", "ADM");

        System.out.println(aluno2.curso);                       // imprimir o Curso do aluno2 = ADM
        //JOptionPane.showMessageDialog(null, aluno2.curso);

        aluno2.trocaDeCurso("ES");                   // Ao invez de imprimir AMD, agora vai imprimir ES
        System.out.println(aluno2.curso);
        //JOptionPane.showMessageDialog(null, aluno2.curso);

        System.out.println(aluno1.nome);                        // imprimir o novo do aluno1 = Enzo
        //JOptionPane.showMessageDialog(null, aluno1.nome);

        aluno1.trocarDeNome("Gabriel");               // Ao invez de imprimir Enzo, agora vai imprimir Gabriel
        System.out.println(aluno1.nome);
        //JOptionPane.showMessageDialog(null, aluno1.nome);
    }
}
