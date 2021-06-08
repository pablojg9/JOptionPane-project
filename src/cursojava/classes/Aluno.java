package cursojava.classes;

import com.java.constantes.StatusAluno;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatricula;
    private String disciplina;

    @Override
    public double salario() {
        return 1500.00D;
    }


    private List<Disciplina>  disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }




    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return super.numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getNome() {
        return super.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return super.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(nomeEscola, aluno.nomeEscola) && Objects.equals(serieMatricula, aluno.serieMatricula) && Objects.equals(disciplina, aluno.disciplina) && Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataMatricula, nomeEscola, serieMatricula, disciplina, disciplinas);
    }

    public float getMediaAluno() {

        float somaNotas = 0.0f;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNota();
        }


        return somaNotas / disciplinas.size();

    }

    public String getEntradaDadoNome() {

        String entrada;
        entrada = JOptionPane.showInputDialog("Coloque seu nome: ");

        return entrada;

    }

    public int getEntradaIdade() {
        String entrada = JOptionPane.showInputDialog("Coloque sua idade: ");

        int resultado;
        resultado = Integer.parseInt(entrada);

        return resultado;
    }

    public String getEntradaDataNascimento() {
            

        String entrada;
        entrada = JOptionPane.showInputDialog("Coloque sua data de nascimento: " + "\n" + "EXEMPLO: xx/xx/xxxx");

        return entrada;

    }

    public String getEntradaNomeEscola() {
        String entrada;
        entrada = JOptionPane.showInputDialog("Coloque sua escola: ");

        return entrada;
    }


    public String getStatus() {
        float media = this.getMediaAluno();

        String result = String.valueOf(media);


        if (media >= 5) {
           if (media >= 7) {
               return StatusAluno.APROVADO;
           }
        return StatusAluno.RECUPERACAO;

        } else {
            System.out.println(StatusAluno.REPROVADO);
        }

        return result;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", disciplina=" +
                '}';

    }

    @Override
    public boolean retornarIdade() {
        return super.retornarIdade();
    }
}


