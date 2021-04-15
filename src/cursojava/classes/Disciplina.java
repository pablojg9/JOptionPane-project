package cursojava.classes;

import javax.swing.*;
import java.util.Objects;

public class Disciplina {

    private float nota1;
    private String disciplina1;
    private float nota2;
    private String disciplina2;
    private float nota3;
    private String disciplina3;
    private float nota4;
    private String disciplina4;
    private float media;



    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Float.compare(that.nota1, nota1) == 0 && Float.compare(that.nota2, nota2) ==
                0 && Float.compare(that.nota3, nota3) == 0 && Float.compare(that.nota4, nota4) ==
                    0 && Float.compare(that.media, media) == 0 && disciplina1.equals(that.disciplina1)
                         && disciplina2.equals(that.disciplina2) && disciplina3.equals(that.disciplina3)
                             && disciplina4.equals(that.disciplina4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota1, disciplina1, nota2, disciplina2, nota3, disciplina3, nota4, disciplina4, media);
    }

    public void getResultado() {
        String notaString = JOptionPane.showInputDialog("Coloque o primeira nota: ");
        String notaString2 = JOptionPane.showInputDialog("Coloque o segunda nota: ");
        String notaString3 = JOptionPane.showInputDialog("Coloque o terceira nota: ");
        String notaString4 = JOptionPane.showInputDialog("Coloque o quarta nota: ");

        float nota = Float.parseFloat(notaString);
        float nota2 = Float.parseFloat(notaString2);
        float nota3 = Float.parseFloat(notaString3);
        float nota4 = Float.parseFloat(notaString4);


        float resultado = (nota + nota2 + nota3 + nota4) /4;

        System.out.println(resultado);

    }
}
