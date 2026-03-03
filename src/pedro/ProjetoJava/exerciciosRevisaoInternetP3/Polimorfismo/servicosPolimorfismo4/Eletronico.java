package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo4;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.Desconto;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4.ProdutoFisico;

public class Eletronico extends ProdutoFisico implements Desconto {
    public Eletronico(String nome, double preco, int estoque, double pesoKg, String dimensoesCm) {
        super(nome, preco, estoque, pesoKg, dimensoesCm);
    }

    @Override
    public double calcularFrete() {
        return super.calcularFrete() + 20;
    }

    @Override
    public double aplicarDesconto(double valor) {
        double desconto = valor * 0.10;
        return getPreco() - desconto; // tava pensando em deixar assim ou deixar get preco * valor
    }

    @Override
    public String getTipoDesconto() {
        return "Frágil";
    }
}
