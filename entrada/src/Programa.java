import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        String idade = JOptionPane.showInputDialog("Digite sua idade");
        int idadeDefinitiva = Integer.parseInt(idade);

        if(idadeDefinitiva >= 18){
            System.out.println("Você está habilitado a se cadastrar no curso");
            JOptionPane.showMessageDialog(null, "Você está habilitado a se cadastrar no curso!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você não poderá se cadastrar no curso :( ");
        }

        System.out.println(nome);
        System.out.println(idadeDefinitiva);
    }
}
