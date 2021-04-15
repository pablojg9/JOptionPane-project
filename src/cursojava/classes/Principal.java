package cursojava.classes;


public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome(aluno.getEntradaDadoNome());
        aluno.setIdade(aluno.getEntradaIdade());
        aluno.setDataNascimento(aluno.getEntradaDataNascimento());
        aluno.setNomeEscola(aluno.getEntradaNomeEscola());


        aluno.setNota1(10);
        aluno.setNota2(10f);
        aluno.setNota3(9.5f);
        aluno.setNota4(9f);



        System.out.println(aluno.getNome() + "\n" +
                aluno.getIdade() + "\n" + aluno.getDataNascimento() + "\n" + aluno.getNomeEscola());

    }

}
