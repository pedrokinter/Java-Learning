package pedro.ProjetoJava.javacore.Oexception.dominios5;

public class Pagamento implements ProcessadorPagamento {
    private double valor;
    private String cartao;
    private String pix;
    private String boleto;


    public void exibir(){
        System.out.println("Sucesso!!");
        System.out.println("Valor do pagamento: R$" + valor);

    }

    @Override
    public void processarPagamento(String metodo) {
        try {
            if  (metodo == null) {
                throw new PagamentoException("Metodo de pagamento invalido!!");
            } else if (valor > 5000 && metodo.equalsIgnoreCase("cartao")) {
                throw new CartaoRecusadoException("Cartão recusado por valor invalido!");
            } else if (valor < 200) {
                throw new SaldoInsuficienteException("Saldo insuficiente! Abaixo do esperado!");
            }
        } catch (PagamentoException | SaldoInsuficienteException e) {
            System.out.println("Erro! - Tipo do erro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        if (cartao == null || cartao.isBlank()) {
            return;
        }
        this.cartao = cartao;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        if (pix == null || pix.isBlank()) {
            return;
        }
        this.pix = pix;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        if (boleto == null || boleto.isBlank()) {
            return;
        }
        this.boleto = boleto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            return;
        }
        this.valor = valor;
    }

    public String getMetodo() {
        if (cartao != null ) {
            return getCartao();
        } else if (boleto != null ) {
            return getBoleto();
        } else {
            return getPix();
        }
    }

}
