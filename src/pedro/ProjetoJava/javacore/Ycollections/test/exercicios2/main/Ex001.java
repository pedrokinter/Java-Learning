package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.Funcionario;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.nomeComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex001 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new LinkedList<>();
        funcionarios.add(new Funcionario("Pedro", "Adm", 2000.0));
        funcionarios.add(new Funcionario("Maria", "Adm", 2000.0));
        funcionarios.add(new Funcionario("Pablo", "Adm Gestor", 3400.0));
        funcionarios.add(new Funcionario("Gabriel", "Gerente", 5000.0));
        funcionarios.add(new Funcionario("Joaquina", "Limpeza", 1600.0));
        funcionarios.add(new Funcionario("Daniel", "CEO", 10000.0));

        funcionarios.sort(new nomeComparator());
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}
