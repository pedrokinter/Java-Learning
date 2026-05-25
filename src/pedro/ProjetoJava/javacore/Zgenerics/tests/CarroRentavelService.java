package pedro.ProjetoJava.javacore.Zgenerics.tests;


import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),  new Carro("Mercedes")));

    public Carro buscarCarrosDisponiveis() {
        System.out.println("Buscando carros disponiveis");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: ");
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Retornando carro alugado" + carro);
        carrosDisponiveis.remove(carro);
    }
}
