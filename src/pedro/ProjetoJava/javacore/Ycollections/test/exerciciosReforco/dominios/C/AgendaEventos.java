package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private TreeSet<Evento> eventos = new TreeSet<>();

    public void adicionarEvento(Evento evento) {
        if (evento == null) return;
        eventos.add(evento);
    }

    public Evento proximoEvento(NavigableSet<Evento> eventos) {
        if (Objects.requireNonNull(eventos.pollLast()).getData().isAfter(LocalDate.now())) {
            return eventos.last();
        } else return null;

    }

//    public TreeSet<Evento> eventoAnterior(NavigableSet<Evento> eventos) {}
//    public TreeSet<Evento> eventosDesseMes(NavigableSet<Evento> eventos) {}
//    public TreeSet<Evento> eventosAPartirDe(NavigableSet<Evento> eventos) {}
}
