package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Pagamento;

public class CartaoCredito  extends Pagamento {
    @Override
    public double processar(double valor) {
        return super.processar(valor);
    }
}
