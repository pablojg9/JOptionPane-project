package cursojava.classes;

import com.java.constantes.StatusAluno;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina();

        HashMap<String, List<Aluno>> map = new HashMap<String, List<Aluno>>();

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 0; qtd <= 1; qtd++) {


            aluno.setNome(aluno.getEntradaDadoNome());
            aluno.setIdade(aluno.getEntradaIdade());
            aluno.setDataNascimento(aluno.getEntradaDataNascimento());
            aluno.setNomeEscola(aluno.getEntradaNomeEscola());
            aluno.getMediaAluno();




            for (int pos = 1; pos <= 4; pos++) {
                Disciplina disciplina1 = new Disciplina();
                Disciplina notaDisciplina = new Disciplina();

                String nomeDisciplina = JOptionPane.showInputDialog("Disciplina: ");
                disciplina1.setDisciplina(nomeDisciplina);

                String notaDisciplina2 = JOptionPane.showInputDialog("Nota da Disciplina: ");
                float resultado = Float.parseFloat(notaDisciplina2);
                disciplina1.setNota(resultado);

                aluno.getDisciplinas().add(disciplina);

            }

            int confirmDialogResult = JOptionPane.showConfirmDialog(null,
                    "Deseja remover alguma disciplina? ");


            for (int counter = 1; counter <= 4; counter++) {
                if (confirmDialogResult == 0) {
                    String dialogRemove = JOptionPane.showInputDialog("Qual a disciplina você quer remover ");


                    aluno.getDisciplinas().remove(Integer.valueOf(dialogRemove).intValue() - 1);
                }
            }
            aluno.getMediaAluno();
        }

        map.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
        map.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
        map.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());


        System.out.println(aluno.getNome() + "\n" +
                aluno.getIdade() + "\n" + aluno.getDataNascimento() + "\n" + aluno.getNomeEscola());
        String informacoes = aluno.toString();
        System.out.println(informacoes);
    }
}
