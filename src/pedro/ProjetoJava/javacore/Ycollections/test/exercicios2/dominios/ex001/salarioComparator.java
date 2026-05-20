package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001;

import java.util.Comparator;

public class salarioComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return Double.compare(o1.getSalario(), o2.getSalario());
    }
}
