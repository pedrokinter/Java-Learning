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
       if (estudantes != null) {
           for (Estudante estudante : estudantes) {
               if (estudante.getNome().equals(aluno.getNome()) && estudante.getMatricula() == aluno.getMatricula()) {
                   return;
               }
           }
           estudantes.add(aluno);
       } else {
           throw new IllegalArgumentException("Lista vazia ou aluno nulo!");
       }
   }

    public void removerAluno(Estudante aluno) {
        if (estudantes != null) {
            for (Estudante estudante : estudantes) {
                if (estudante.getMatricula() == aluno.getMatricula()) {
                    estudantes.remove(estudante);
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("Lista vazia ou aluno nulo!");
        }
    }

    public void calcularMedia() {
       double soma = 0;

       if (estudantes == null) {
           throw new IllegalArgumentException("Turma vazia, impossivel calcular a média!");
       }

       for (Estudante estudante : estudantes) {
           soma += estudante.getNotaFinal();
       }
       double media = soma / estudantes.size();
       System.out.println("A média final da nota de todos os alunos é igual a: " + media);
    }

    public void aprovados() {
       List<Estudante> aprovados = new ArrayList<>();
       for (Estudante estudante : estudantes) {
           if (estudante.getNotaFinal() >= 6) {
               aprovados.add(estudante);
           }
       }

       aprovados.sort(new estudanteComparadorNome());

       System.out.println("LISTA DE APROVADOS: ");
       for (Estudante aprovado : aprovados) {
           System.out.println(aprovado);
       }
    }

    public void reprovados(){
        List<Estudante> reprovados = new ArrayList<>();
        for (Estudante estudante : estudantes) {
            if (estudante.getNotaFinal() < 6) {
                reprovados.add(estudante);
            }
        }

        reprovados.sort(new estudanteComparadorNome());
        System.out.println("LISTA DE REPROVADOS: ");

        for (Estudante reprovado : reprovados) {
            System.out.println(reprovado);
        }
    }

}
