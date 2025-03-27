import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("01", "Enzo", "CDIA");
        Aluno aluno2 = new Aluno("02", "Bruna", "ADM");

        JOptionPane.showMessageDialog(null, aluno2.curso);

        aluno2.trocaDeCurso("ES");
        JOptionPane.showMessageDialog(null, aluno2.curso);

        JOptionPane.showMessageDialog(null, aluno1.nome);

        aluno1.trocarDeNome("Gabriel");
        JOptionPane.showMessageDialog(null, aluno1.nome);
    }
}
