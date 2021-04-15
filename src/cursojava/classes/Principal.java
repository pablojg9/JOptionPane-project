package cursojava.classes;


public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome(aluno.getEntradaDadoNome());
        aluno.setIdade(aluno.getEntradaIdade());
        aluno.setDataNascimento(aluno.getEntradaDataNascimento());
        aluno.setNomeEscola(aluno.getEntradaNomeEscola());
        aluno.getMediaAluno();






        System.out.println(aluno.getNome() + "\n" +
                aluno.getIdade() + "\n" + aluno.getDataNascimento() + "\n" + aluno.getNomeEscola());

    }

}
