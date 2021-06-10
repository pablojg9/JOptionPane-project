package com.projeto.executaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        StringBuilder stringBuilder = new StringBuilder();

        aluno.setNome("Pablo Junior");
        aluno.setNomeEscola("Jdev treinamentos");

        Disciplina disciplina = new Disciplina();

        disciplina.setDisciplina("curso de java");

        float[] notasMedia = {
                8.8f,
                7.4f,
        };

        disciplina.setNota(notasMedia);

        System.out.println("Nome do aluno" + aluno.getNome());
        for(Disciplina dis : aluno.getDisciplinas()) {
            System.out.println();
        }

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
