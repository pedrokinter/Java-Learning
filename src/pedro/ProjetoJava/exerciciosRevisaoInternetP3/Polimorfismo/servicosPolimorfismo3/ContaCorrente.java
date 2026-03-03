package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.Tributavel;

public class ContaCorrente extends ContaBancaria implements Tributavel {
    public ContaCorrente(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
        setSaldo(getSaldo() - 15); // taxa manutençao 15 reais
    }

    @Override
    public double sacar(double valor) {
        if (getSaldo() <= -500){
            System.out.println("Saldo indisponivel para sacar");
            return getSaldo();
        }
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    @Override
    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }

    @Override
    public double calcularImposto() {
        return getSaldo() * 0.005;
    }

    @Override
    public String getTipoAtributo() {
        return "Conta Corrente";
    }
}
