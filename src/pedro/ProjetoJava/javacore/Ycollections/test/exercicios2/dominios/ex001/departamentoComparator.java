package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001;

import java.util.Comparator;
import java.util.List;

public class departamentoComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        int departamento = o1.getDepartamento().compareToIgnoreCase(o2.getDepartamento());
        if (departamento != 0) {
            return departamento;
        }

        return Double.compare(o2.getSalario(), o1.getSalario());
    }

    // mas da para usar .comparing e .thenComparingRight, pois é mais atualizado e menos trabalhoso
    // Comparator<Person> comparator = Comparator
    //    .comparing(Person::getName)           // Sort primario que define a ordem inicial a ser sorteada
    //    .thenComparingInt(Person::getAge);    // se o sort primario retornar zero, vem pra ca e faz o sort
    //    com a idade
}
