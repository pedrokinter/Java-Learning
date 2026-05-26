package pedro.ProjetoJava.Revisão.exerciciosRevisaoInternet;

import pedro.ProjetoJava.Revisão.exerciciosRevisaoInternet.dominios.contaBancaria024;

public class exercicio024Internet {
    public static void main(String[] args) {
        contaBancaria024 conta = new contaBancaria024("20", 2000, "pedro");

        contaBancaria024.taxaJuros = 20;

        conta.depositar(100);
        conta.depositar(100, "luis");

        conta.sacar(1000);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getTitular());
        System.out.println(contaBancaria024.getTaxaJuros() * conta.getSaldo());
    }

}
