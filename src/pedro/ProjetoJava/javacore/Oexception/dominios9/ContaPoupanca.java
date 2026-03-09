package pedro.ProjetoJava.javacore.Oexception.dominios9;

import pedro.ProjetoJava.javacore.Oexception.dominios9.model.ContaAbstrata;
import pedro.ProjetoJava.javacore.Oexception.dominios9.model.TipoErro;
import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.TransacaoException;

public class ContaPoupanca extends ContaAbstrata {
    public ContaPoupanca(double saldo, String status) {
        super(saldo, status);
    }

    public void aplicarRendimento(double taxa) throws TransacaoException{ // nao sei se aq era pra retornar um double
        if(!getStatus().equalsIgnoreCase("Ativo")) {
            throw new TransacaoException("Erro na conta poupança!!", TipoErro.CONTA_INATIVA);
        }
        System.out.println("Aplicando rendimento na conta!!");
        setSaldo(getSaldo() + taxa);
    }

    @Override
    public void sacar(double valor) throws TransacaoException{
        if (valor <= 0) {
            throw new TransacaoException("ERRO Conta Poupanca Sacar! ", TipoErro.VALOR_NEGATIVO);
        } else if (!getStatus().equalsIgnoreCase("Ativo")) {
            throw new TransacaoException("ERRO no saque, conta poupanca inativa! ", TipoErro.CONTA_INATIVA);
        } else if (getSaldo() <= 0) {
            throw new TransacaoException("ERRO no saque, saldo insuficiente! ", TipoErro.SALDO_INSUFICIENTE);
        }
        System.out.println("Sacando da conta poupanca!");
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void depositar(double valor) throws TransacaoException{

        if (!getStatus().equalsIgnoreCase("Ativo")) {
            throw new TransacaoException("ERRO no deposito poupanca, conta corrente inativa! ", TipoErro.CONTA_INATIVA);
        } else if (getSaldo() < 0 ) {
            throw new TransacaoException("ERRO no deposito poupanca, saldo insuficiente! ", TipoErro.SALDO_INSUFICIENTE);
        }
        System.out.println("Depositando na conta corrente!");
        setSaldo(getSaldo() + valor);
    }
}
