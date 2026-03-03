package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    public double rendimentoMensal(double taxa) {
        return getSaldo() * (taxa/100);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0){
            System.out.println("Valor para saque da conta Poupança negativo!!");
            return getSaldo();
        }
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    @Override
    public double depositar(double valor) {
        if (valor < 0) {
            System.out.println("erro, não pode valor menor que 0");
            return getSaldo();
        }
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }


}
