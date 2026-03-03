package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.Tributavel;

public class ContaInvestimento extends ContaBancaria implements Tributavel {
    private double taxaRendimento;

    public ContaInvestimento(String titular, String numeroConta, double saldo, double taxaRendimento) {
        super(titular, numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double aplicar(double valor){
        return valor * taxaRendimento;
    }

    @Override
    public double sacar(double valor) {
        if (valor < 0) {
            System.out.println("erro, não pode valor menor que 0");
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

    @Override
    public double calcularImposto() {
        return 0.15 * this.taxaRendimento;
    }

    @Override
    public String getTipoAtributo() {
        return "Conta Investimento";
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento < 0)
            return;
        this.taxaRendimento = taxaRendimento;
    }
}
