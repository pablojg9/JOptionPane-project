package cursojava.classes;

import java.util.Objects;

// Disciplina servirá para todos os objetos

public class Disciplina {

    private float[] nota = new float[4];
    private String disciplina;

    public float[] getNota() {
        return nota;
    }

    public void setNota(float[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    public float getMediaNota() {
        float somaTotal = 0;

        for (int i = 0; i < getNota().length; i++) {
            somaTotal += getNota()[i];
        }
        return somaTotal / 4;
    }

}
