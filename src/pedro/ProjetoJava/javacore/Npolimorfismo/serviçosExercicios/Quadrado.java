package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Forma;

public class Quadrado extends Forma {
    private double altura;
    private double largura;

    public Quadrado(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double CalcularArea() {
        return altura * largura;
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
