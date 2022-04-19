import javax.swing.*;

public class Guprojeto4 {

    public static void main(String[] args) {

        String nome, n1, n2, n3;
        double nota1, nota2, nota3, media;
        int i;

        for (i = 0; i <= 2; i++) {

            nome = JOptionPane.showInputDialog("Digite o nome do aluno(a) ");

            n1 = JOptionPane.showInputDialog("Digite a 1 nota");
            n2 = JOptionPane.showInputDialog("Digite a 2 nota");
            n3 = JOptionPane.showInputDialog("Digite a 3 nota");

            nota1 = Double.parseDouble(n1);
            nota2 = Double.parseDouble(n2);
            nota3 = Double.parseDouble(n3);

            media = (nota1 + nota2 + nota3) / 3;

            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "Aluno " + nome + "\n" + "A média do aluno(a) é " + media + "\n" + "Aluno Aprovado.", "Situação do Aluno(a)", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Aluno " + nome + "\n" + "A média do aluno(a) é " + media + "\n" + "Aluno Reprovado.", "Situação do Aluno(a)", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
