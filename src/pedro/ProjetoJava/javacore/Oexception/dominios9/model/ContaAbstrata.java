package pedro.ProjetoJava.javacore.Oexception.dominios9.model;

import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.TransacaoException;

public abstract class ContaAbstrata implements AutoCloseable{
    private double saldo;
    private String status; // aq so pode ativo ou inativo

    public ContaAbstrata(double saldo, String status) {
        if (status.equalsIgnoreCase("ativo")){
            this.status = status;
        } else if (status.equalsIgnoreCase("inativo")){
            this.status = status;
        } else {
            System.out.println("Erro, status digitado não é ativo ou inativo, irá retornar nulo!");
            this.status = null;
        }
        this.saldo = saldo;

    }

    public abstract void sacar(double valor) throws TransacaoException;
    public abstract void depositar(double valor) throws TransacaoException;

    @Override
    public void close() throws Exception {
        System.out.println("Encerrando sessão da conta!");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
            return;
        }
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isBlank())
            return;
        this.status = status;
    }
}
