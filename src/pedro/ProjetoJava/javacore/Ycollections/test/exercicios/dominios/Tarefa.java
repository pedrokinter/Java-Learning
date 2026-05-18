package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    private String titulo;
    private LocalDate dataCriacao;
    private boolean concluida;

    public Tarefa(String titulo, LocalDate dataCriacao, boolean concluida) {
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", concluida=" + concluida +
                '}';
    }

    public static ResultadoTarefas retornarListasOrdenadas(List<Tarefa> tarefas) {
        List <Tarefa> tarefasConcluidas = new ArrayList<>();
        List <Tarefa> tarefasPendentes = new ArrayList<>();

        for (Tarefa tarefa : tarefas) {
            if(tarefa.isConcluida()){
                tarefasConcluidas.add(tarefa);
            } else {
                tarefasPendentes.add(tarefa);
            }
        }

        Collections.sort(tarefasConcluidas);
        Collections.sort(tarefasPendentes);

        return new ResultadoTarefas(tarefasConcluidas, tarefasPendentes);
    }

    @Override
    public int compareTo(Tarefa o) {
        return this.dataCriacao.compareTo(o.dataCriacao);
    }
}
