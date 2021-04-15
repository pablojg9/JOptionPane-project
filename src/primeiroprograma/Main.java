package primeiroprograma;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Coloque a quantidade de carros");
        String pessoas = JOptionPane.showInputDialog("Coloque a quantidade de pessoas");

        int carroNumero = Integer.parseInt(carros);
        int pessoaNumero = Integer.parseInt(pessoas);

        int result = (carroNumero + pessoaNumero);
        int resto  = carroNumero % pessoaNumero;

        JOptionPane.showMessageDialog(null,
                "A soma: " + result + "\n" + "o resto da divisão é " + resto);

        int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza? " +
                "que A soma entre quantidade de carros e pessoas estão certas também o resto da divisão?");

        if (confirmacao == JOptionPane.NO_OPTION) {
            JOptionPane.showInputDialog("Coloque novamente a quantidade de carros");
            JOptionPane.showInputDialog("Coloque novamente a quantidade de pessoas");

            JOptionPane.showMessageDialog(null,
                    "A soma: " + result + "\n" + "o resto da divisão é " + resto);


        }
        else if (confirmacao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "A soma é: " + result +"\n" + "Resto da Divisão: " + resto );
        }

    }
}
