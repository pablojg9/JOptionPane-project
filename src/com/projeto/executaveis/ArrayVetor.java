package com.projeto.executaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.JOptionPane;

public class ArrayVetor {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Pablo Junior");
        aluno.setNomeEscola("Jdev treinamentos");

        Disciplina disciplina = new Disciplina();

        Aluno[] alunosArray = new Aluno[1];

        alunosArray[0] = aluno;

        disciplina.setDisciplina("curso de java");

        for (int counterPosition = 0; counterPosition < alunosArray.length; counterPosition++) {
            System.out.println("Nome do aluno é " + alunosArray[counterPosition].getNome());

            for (Disciplina d : alunosArray[counterPosition].getDisciplinas()) {
                System.out.println("Nome da disciplina é: " + d.getDisciplina());

                for (int notasLoop = 0; notasLoop < d.getNota().length; notasLoop++) {
                    System.out.println("A" + notasLoop + "º notas dos alunos = " + d.getNota()[notasLoop]);
                }
            }
        }




        /*
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
}*/
    }
}