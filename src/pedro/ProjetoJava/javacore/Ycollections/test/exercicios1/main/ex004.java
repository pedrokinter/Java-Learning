package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.ResultadoTarefas;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Tarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex004 {
    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa("arrumar Linkedin", LocalDate.now(), true));
        tarefas.add(new Tarefa("arrumar Github", LocalDate.of(2026, 4, 10), false));
        tarefas.add(new Tarefa("Ver curso java", LocalDate.of(2026, 1, 10), false));
        tarefas.add(new Tarefa("Arrumar a casa", LocalDate.of(2026, 5, 13), true));
        tarefas.add(new Tarefa("Lavar roupa", LocalDate.of(2026, 5, 9), false));

        Collections.sort(tarefas);
        System.out.println("Tarefas organizadas por data de criação!: ");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }

        System.out.println("----------------------------------");

        ResultadoTarefas resultado = Tarefa.retornarListasOrdenadas(tarefas);
        System.out.println(resultado.getConcluidas());
        System.out.println(resultado.getPendentes());

        // eu sei que aqui provavelmente o certo é criar uma lista privada
        // dentro de tarefa e depois criar um objeto de tarefa que va receber essa lista, mas desse jeito fica muito
        // mais agradavel de fazer
    }
}
