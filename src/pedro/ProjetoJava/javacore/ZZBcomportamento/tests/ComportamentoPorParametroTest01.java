package pedro.ProjetoJava.javacore.ZZBcomportamento.tests;

import pedro.ProjetoJava.javacore.ZZBcomportamento.dominios.Carro;
import pedro.ProjetoJava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    public static void main(String[] args) {
        List<Carro> carros = List.of(new Carro("bmw", 2020), new Carro("mercedez", 2023)
        , new Carro("ferrari", 2022), new Carro("mercedez", 2006));

        List<Carro> marcaFiltrado = filtro(carros, new CarPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getMarca().equals("mercedez");
            }
        });

        List<Carro> anoFiltrado = filtro(carros, carro -> carro.getAno() < 2020);

        System.out.println(marcaFiltrado);

        System.out.println("---------------------");
        System.out.println(anoFiltrado);
    }



    private static List<Carro> filtro (List<Carro> carros, CarPredicate carPredicate) {
        List<Carro> carrosFiltrados = new ArrayList<>();

        for (Carro carro : carros) {
            if (carPredicate.test(carro)) {
                carrosFiltrados.add(carro);
            }
        }
        return carrosFiltrados;
    }
}
