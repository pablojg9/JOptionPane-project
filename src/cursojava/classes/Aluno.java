package cursojava.classes;

import javax.swing.JOptionPane;

public class Aluno {

    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String nomeEscola;
    private String nome;
    private int idade;

    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;


    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
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

    public float getMediaAluno() {
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;

        return media;
    }

    public boolean getAlunoAprovado() {
       this.media = this.getMediaAluno();

        if (media >= 7) {
            return true;
        } else {
            return false;

        }

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

        int parse = Integer.parseInt(entrada);

        if (parse >= 0) {
            int confirmDialogText = JOptionPane.showConfirmDialog(null, "Coloque uma escola e nao um número");
            if (confirmDialogText == JOptionPane.OK_OPTION) {
                entrada = JOptionPane.showInputDialog("Coloque sua escola Novamente: ");

            }
        }

        return entrada;
    }


}
