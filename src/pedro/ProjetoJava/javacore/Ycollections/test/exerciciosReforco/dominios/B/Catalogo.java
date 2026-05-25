package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.B;

import java.util.*;

public class Catalogo {
    private TreeMap<Double, List<Filme>> catalogo = new TreeMap<>();

    public void adicionarFilme(Filme filme) {
        List<Filme> listaFilmes = catalogo.getOrDefault(filme.getNota(), new ArrayList<>());
        listaFilmes.add(filme);
        catalogo.put(filme.getNota(), listaFilmes);
    }

    public NavigableMap<Double, List<Filme>> filmesAcimaDaNota(double nota) {
        return catalogo.tailMap(nota, false);
    }

    public List<Filme> melhorFilme() {
        List<Filme> listaFilmes = new ArrayList<>();
        for (Map.Entry<Double, List<Filme>> entry : catalogo.entrySet()) {
            if (Objects.equals(entry.getKey(), catalogo.lastKey())) {
                listaFilmes.addAll(entry.getValue());
            }
        }

        return listaFilmes;
    }

    public NavigableMap<Double, List<Filme>> filmeEntreNotas(double notaI, double notaF) {
        return catalogo.subMap(notaI, false, notaF, false);

    }
}
