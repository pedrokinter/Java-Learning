package pedro.ProjetoJava.javacore.ZZBcomportamento.tests;

import pedro.ProjetoJava.javacore.ZZBcomportamento.dominios.Carro;
import pedro.ProjetoJava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    public static void main(String[] args) {
        List<Carro> carros = List.of(new Carro("bmw", 2020), new Carro("mercedez", 2023)
        , new Carro("ferrari", 2022), new Carro("mercedez", 2006), new Carro("BMW", 2026));

        List<String> nomes = List.of("Pedro", "Joao", "Maria", "Pedro Pires", "Pedro Arthur");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Carro> anoFiltrado = filtro(carros, carro -> carro.getAno() < 2020);

        System.out.println("---------------------");
        System.out.println(anoFiltrado);
        System.out.println("---------------------");
        System.out.println(filtro(carros, carro -> carro.getMarca().equalsIgnoreCase("bmw")));
        System.out.println("---------------------");
        System.out.println("teste com nomes: ");
        System.out.println(filtro(nomes, nome -> nome.toLowerCase().contains("pedro")));
        System.out.println("---------------------");
        System.out.println("teste com numeros: ");
        System.out.println(filtro(numeros, numero -> numero % 2 == 0));
    }


    
    private static <T> List<T> filtro (List<T> listaGenerica, Predicate<T> generico) {
        List<T> listaFiltrados = new ArrayList<>();

        for (T objeto : listaGenerica) {
            if (generico.test(objeto)) {
                listaFiltrados.add(objeto);
            }
        }

        return listaFiltrados;

    }
}
