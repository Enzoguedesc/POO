import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        try {
            String salario = JOptionPane.showInputDialog("Informe seu salário");
            float salarioDefinitiva = Float.parseFloat(salario);

            if (salarioDefinitiva == 0) {
                JOptionPane.showMessageDialog(null, "O programa foi encerrado porque o salário é R$0.", "Encerrando", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }

            String percentual = JOptionPane.showInputDialog("Informe o percentual de aumento (%)");
            float percentualDefinitiva = Float.parseFloat(percentual);

            float aumento = salarioDefinitiva * (percentualDefinitiva/ 100);
            float novoSalario = salarioDefinitiva + aumento;

            JOptionPane.showMessageDialog(null, "Aumento de R$" + aumento, "Aumento", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Seu novo salário será de R$" + novoSalario, "Novo Salário", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }


        /*  OU
        import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário");
        float percentual = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de aumento (%)");

        float aumento = salario * (percentual/100);
        float novoSalario = salario * aumento;

        JOptionPane.showMessageDialog(null, "Aumento de R$" + aumento);
        JOptionPane.showMessageDialog(null, "Seu novo salário será de R$" + novoSalario);
        */
    }
}
