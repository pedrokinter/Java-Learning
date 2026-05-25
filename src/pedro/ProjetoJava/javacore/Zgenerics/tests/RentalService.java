package pedro.ProjetoJava.javacore.Zgenerics.tests;


import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> { // T = type
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarobjetosDisponiveis() {
        System.out.println("Buscando objetos disponiveis");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando: " +t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t) {
        System.out.println("Retornando carro alugado" + t);
        objetosDisponiveis.remove(t);
    }
}
