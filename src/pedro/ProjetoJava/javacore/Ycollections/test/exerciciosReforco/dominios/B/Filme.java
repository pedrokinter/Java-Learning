package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.B;

import java.util.*;

public class Filme {
    private String titulo;
    private double nota;

    public Filme(String titulo, double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", nota=" + nota +
                '}';
    }

    public double getNota() {
        return nota;

    }

}
