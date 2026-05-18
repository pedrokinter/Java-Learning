package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

import java.util.List;

public class ResultadoTarefas {
    private List<Tarefa> concluidas;
    private List<Tarefa> pendentes;

    public ResultadoTarefas(List<Tarefa> concluidas, List<Tarefa> pendentes) {
        this.concluidas = concluidas;
        this.pendentes = pendentes;
    }

    public List<Tarefa> getConcluidas() {
        return concluidas;
    }

    public List<Tarefa> getPendentes() {
        return pendentes;
    }
}
