package pedro.ProjetoJava.Revisão.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces;

public class Boleto extends Transacao{
    public Boleto(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public double calcularTaxa() {
        return 3.50;
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Boleto pago!!");
    }
}
