package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo;

public class Van extends Veiculo{
    private boolean climatizado;

    public Van(String modelo, double capacidadeKg, boolean climatizado) {
        super(modelo, capacidadeKg);
        this.climatizado = climatizado;
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        if (climatizado) {
            double valorBase = distanciaKm * 0.5;
            return valorBase + (valorBase * 0.15);
        }
        return distanciaKm * 0.5;
    }

    @Override
    public String exibirTipo() {
        return "Van";
    }

    public void setClimatizado(boolean climatizado) {
        this.climatizado = climatizado;
    }

    public boolean isClimatizado() {
        return climatizado;
    }

}
