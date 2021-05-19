package cursojava.classes;

import com.classesauxiliares.FuncaoAutenticacao;
import com.interfaces.projetos.PermitirAcesso;
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

        try {

            String login = JOptionPane.showInputDialog("Digite seu login: ");
            String senha = JOptionPane.showInputDialog("Digite sua senha: ");

            FuncaoAutenticacao funcaoAutenticacao;
            PermitirAcesso permitirAcesso = new Secretario();

            if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {
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

                        try {
                            String nomeDisciplina = JOptionPane.showInputDialog("Disciplina: ");
                            disciplina1.setDisciplina(nomeDisciplina);

                            String notaDisciplina2 = JOptionPane.showInputDialog("Nota da Disciplina: ");
                            float resultado = Float.parseFloat(notaDisciplina2);
                            disciplina1.setNota(resultado);

                        } catch (NumberFormatException n) {
                            n.printStackTrace();
                            JOptionPane.showMessageDialog(null, "error ");


                            n.printStackTrace();
                        }
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
            } else {
                JOptionPane.showMessageDialog(null, "Login e senha invalida!");
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Mensagem de erro: " + e.getMessage());

            for (int counter = 0; counter < e.getStackTrace().length; counter++) {
                System.out.println("Classe de erro: " + e.getStackTrace()[counter].getClassName());
                System.out.println("metodo de erro: " + e.getStackTrace()[counter].getMethodName());
                System.out.println("linha de erro: " + e.getStackTrace()[counter].getLineNumber());

            }
        }
    }
}
