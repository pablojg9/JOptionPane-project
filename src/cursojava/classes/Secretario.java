package cursojava.classes;

public class Secretario extends Pessoa{

    private String registro;
    private int nivelCargo;
    private String experiencia;

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
}
