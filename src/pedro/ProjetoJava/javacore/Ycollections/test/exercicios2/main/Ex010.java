package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex010.Paciente;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex010.Prioridade;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex010 {
    public static void main(String[] args) {
        Queue<Paciente> pacientes = new PriorityQueue<>();
        pacientes.add(new Paciente("Pedro", 12, Prioridade.NORMAL));
        pacientes.add(new Paciente("Maria", 60, Prioridade.NORMAL));
        pacientes.add(new Paciente("Gabriel", 40, Prioridade.URGENTE));
        pacientes.add(new Paciente("Ana", 8, Prioridade.AGENDADO));
        pacientes.add(new Paciente("Alana", 16, Prioridade.NORMAL));
        pacientes.add(new Paciente("Amanda", 24, Prioridade.URGENTE));

        Collections.sort(pacientes.stream().toList());
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}
