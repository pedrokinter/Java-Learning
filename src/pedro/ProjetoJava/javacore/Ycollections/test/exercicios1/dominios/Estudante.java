package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios;

import java.util.List;
import java.util.Objects;

public class Estudante implements Comparable<Estudante> {
    private String nome;
    private int matricula;
    private double notaFinal;

    public Estudante(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public static void verificarEstudante(Estudante aluno, List<Estudante> estudantes) {
        if (estudantes.contains(aluno)) {
                System.out.println("Estudante apresentado  ESTÁ na lista! ");
            } else {
                System.out.println("Estudante apresentado não está na lista! ");
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", notaFinal=" + notaFinal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return matricula == estudante.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }


    @Override
    public int compareTo(Estudante o) {
        return Double.compare(this.notaFinal, o.notaFinal);
    }
}
