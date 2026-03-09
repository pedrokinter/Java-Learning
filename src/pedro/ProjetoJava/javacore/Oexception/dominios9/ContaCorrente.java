package pedro.ProjetoJava.javacore.Oexception.dominios9;

import pedro.ProjetoJava.javacore.Oexception.dominios9.model.ContaAbstrata;
import pedro.ProjetoJava.javacore.Oexception.dominios9.model.TipoErro;
import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.TransacaoException;

public class ContaCorrente extends ContaAbstrata {
    public ContaCorrente(double saldo, String status) {
        super(saldo, status);
    }

    @Override
    public void sacar(double valor) throws TransacaoException {
        if (valor <= 0) {
            throw new TransacaoException("ERRO no saque, valor negativo! ", TipoErro.VALOR_NEGATIVO);
        } else if (!getStatus().equalsIgnoreCase("Ativo")) {
            throw new TransacaoException("ERRO no saque, conta corrente inativa! ", TipoErro.CONTA_INATIVA);
        } else if (getSaldo() <= 0 ) {
            throw new TransacaoException("ERRO no saque, saldo insuficiente! ", TipoErro.SALDO_INSUFICIENTE);
        }
        System.out.println("Sacando da conta corrente!");
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void depositar(double valor) throws TransacaoException {

        if (!getStatus().equalsIgnoreCase("Ativo")) {
            throw new TransacaoException("ERRO no deposito corrente, conta corrente inativa! ", TipoErro.CONTA_INATIVA);
        } else if (getSaldo() < 0 ) {
            throw new TransacaoException("ERRO no deposito corrente, saldo insuficiente! ", TipoErro.SALDO_INSUFICIENTE);
        }
        System.out.println("Depositando na conta corrente!");
        setSaldo(getSaldo() + valor);
    }
}
