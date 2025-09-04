package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Forma;

public class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
