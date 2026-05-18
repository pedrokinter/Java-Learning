package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class estudanteComparadorNome implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return estudante1.getNome().compareTo(estudante2.getNome());
    }
}


public class Turma {
   private List<Estudante> estudantes = new ArrayList<>();

   public List<Estudante> getEstudantes() {
        return estudantes;
   }

   public void adicionarAluno(Estudante aluno) {
       if (aluno == null) {
           throw new IllegalArgumentException("Aluno nulo ou vazio!");
       }

       if (!estudantes.contains(aluno)) {
           estudantes.add(aluno);
       }

   }

    public void removerAluno(Estudante aluno) {
       if (aluno == null) {
           throw new IllegalArgumentException("Aluno nulo ou vazio!");
       }

        estudantes.remove(aluno);
    }

    public double calcularMedia() {
       double soma = 0;

       if (estudantes.isEmpty()) {
           throw new IllegalArgumentException("Turma vazia!"); // vou fazer a exceçao personalizada não
       }
       for (Estudante estudante : estudantes) {
           soma += estudante.getNotaFinal();
       }

        return soma / estudantes.size();
    }

    public List<Estudante> aprovados() {
       List<Estudante> aprovados = new ArrayList<>();
       for (Estudante estudante : estudantes) {
           if (estudante.getNotaFinal() >= 6) {
               aprovados.add(estudante);
           }
       }

       aprovados.sort(new estudanteComparadorNome());

       return aprovados;
    }

    public List<Estudante> reprovados(){
        List<Estudante> reprovados = new ArrayList<>();
        for (Estudante estudante : estudantes) {
            if (estudante.getNotaFinal() < 6) {
                reprovados.add(estudante);
            }
        }
        reprovados.sort(new estudanteComparadorNome());

        return reprovados;
    }

}
