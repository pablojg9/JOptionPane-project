package cursojava.classes;

import com.interfaces.projetos.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private int nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;

    }
    public Secretario() {

    }


    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(int nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double salario() {
        return 2000.10;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;

        return login.equals("admin") && login.equals("admin");
    }

    @Override
    public boolean autenticarLogin() {
       return true;
    }


}
