package primeiroprograma;

import javax.swing.JOptionPane;

public class MainJOptionPane {
    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog(null, "Coloque a primeira nota: ");
        String nota2 = JOptionPane.showInputDialog(null, "Coloque a segunda nota: ");
        String nota3 = JOptionPane.showInputDialog(null, "Coloque a terceira nota: ");
        String nota4 =JOptionPane.showInputDialog(null, "Coloque a quarta nota: ");

        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double resultado = (dNota1 + dNota2 + dNota3 + dNota4) /4;

        JOptionPane.showMessageDialog(null, "Você tirou " + resultado);

        if (resultado >= 5) {
            if (resultado >= 7) {
                JOptionPane.showMessageDialog(null, "Você passou de ano pois tirou " + resultado);
            } else if (resultado >= 5 && resultado <= 6) {
                JOptionPane.showMessageDialog(null, "Você ficou de recuperação pois tirou " + resultado);
            }
        }
        else if (resultado >= 1 && resultado <= 4) {
            JOptionPane.showMessageDialog(null, "Você não passou de ano pois tirou " + resultado);
        }
        else {
            JOptionPane.showMessageDialog(null, "Ops! Algo deu errado!");
        }






    }
}
