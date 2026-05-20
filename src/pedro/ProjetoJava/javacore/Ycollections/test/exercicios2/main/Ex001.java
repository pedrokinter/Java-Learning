package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001.Funcionario;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001.departamentoComparator;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001.nomeComparator;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex001.salarioComparator;


import java.util.LinkedList;
import java.util.List;

public class Ex001 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new LinkedList<>();
        funcionarios.add(new Funcionario("Pedro", "Adm", 2000.0));
        funcionarios.add(new Funcionario("Maria", "Adm", 2000.0));
        funcionarios.add(new Funcionario("Mel", "Adm", 3500.0));
        funcionarios.add(new Funcionario("Pablo", "Adm Gestor", 3400.0));
        funcionarios.add(new Funcionario("Gabriel", "Gerente", 5000.0));
        funcionarios.add(new Funcionario("Joaquina", "Limpeza", 1600.0));
        funcionarios.add(new Funcionario("Daniel", "Caminhoneiro", 10000.0));
        funcionarios.add(new Funcionario("MANOEL", "Caminhoneiro", 6000.0));

        funcionarios.sort(new nomeComparator());

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("---------------------");
        funcionarios.sort(new salarioComparator());

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("---------------------");

        funcionarios.sort(new departamentoComparator());

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}
