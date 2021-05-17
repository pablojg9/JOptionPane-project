package cursojava.classes;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Pablo");
        aluno.setIdade(17);

        // --- ----- ---
        Diretor diretor = new Diretor();
        diretor.setNome("Diretor : pablo");
        diretor.setRegistroGeral("14141414143");
        diretor.setIdade(45);

        // ---- ---- --- ----
        Secretario secretario = new Secretario();
        secretario.setExperiencia("Pleno");
        secretario.setIdade(26);
        secretario.setNome("Lucas");


        aluno.retornarIdade();
        diretor.retornarIdade();
        secretario.retornarIdade();

        teste(aluno);
        teste(diretor);
        teste(secretario);


    }
    public static void teste(Pessoa pessoa) {
        System.out.println("pessoa é demais " + pessoa.getNome() + " ela tem " + pessoa.getIdade() + " anos "
                + " salario " + pessoa.salario());

    }

}
