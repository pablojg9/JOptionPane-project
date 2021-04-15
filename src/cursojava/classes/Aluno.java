package cursojava.classes;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Aluno {

    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String nomeEscola;
    private String nome;
    private int idade;

    private Disciplina disciplina = new Disciplina();

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
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
        return numeroCpf;
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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void getMediaAluno() {

        disciplina.getResultado();

    }

    public boolean getAlunoAprovado() {
        float media = getDisciplina().getMedia();

        if (media >= 7) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(dataNascimento, aluno.dataNascimento)
                && Objects.equals(registroGeral, aluno.registroGeral)
                    && Objects.equals(numeroCpf, aluno.numeroCpf)
                        && Objects.equals(nomeMae, aluno.nomeMae)
                            && Objects.equals(nomePai, aluno.nomePai)
                                && Objects.equals(nomeEscola, aluno.nomeEscola) && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai, nomeEscola, nome, idade);
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
}
