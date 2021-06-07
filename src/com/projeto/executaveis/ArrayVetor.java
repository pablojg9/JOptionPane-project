package com.projeto.executaveis;


import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {

        //TIPO DE DADOS ARRAY - NOME DA VARIAVEL DO ARRAY - LIMITE DO ARRAY
        String posicao = JOptionPane.showInputDialog("Quantas posições o array precisa ter: ");

        float[] notas = new float[Integer.parseInt(posicao)];

        for (int pos = 0; pos < notas.length; pos++) {
            String valor = JOptionPane.showInputDialog("Coloque a nota: " + pos);
            notas[pos] = Integer.parseInt(valor);
        }

        for (int counter = 0; counter < notas.length; counter++) {
            System.out.println("nota: " + (counter + 1) + " é = "  + notas[counter]);
        }
    }
}
