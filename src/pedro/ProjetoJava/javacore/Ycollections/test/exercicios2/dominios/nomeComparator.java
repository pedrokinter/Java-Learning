package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios;

import java.util.Comparator;

public class nomeComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
