package com.projeto.executaveis;

import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        //TIPO DE DADOS ARRAY - NOME DA VARIAVEL DO ARRAY - LIMITE DO ARRAY
        String posicao = JOptionPane.showInputDialog("Quantas posições o array precisa ter: ");

        float[] notas = new float[Integer.parseInt(posicao)];

        for (int pos = 0; pos < notas.length; pos++) {
            String valor = JOptionPane.showInputDialog("Coloque a nota: " + (pos + 1));
            notas[pos] = Integer.parseInt(valor);
        }

        for (int counter = 0; counter < notas.length; counter++) {
           stringBuilder.append("nota ").append(counter + 1).append(" é = ").append(notas[counter]).append("\n");
        }
        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }
}
