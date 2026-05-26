package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C.AgendaEventos;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C.Evento;

import java.time.LocalDate;

public class reforcoC {
    public static void main(String[] args) {
        Evento evento = new Evento("evento 1", LocalDate.now());
        Evento evento1 = new Evento("evento 2", LocalDate.of(2026, 5, 30));
        Evento evento2 = new Evento("evento 3", LocalDate.of(2026, 4, 25));

        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(evento);
        agenda.adicionarEvento(evento1);
        agenda.adicionarEvento(evento2); // continuar amanha
    }
}
