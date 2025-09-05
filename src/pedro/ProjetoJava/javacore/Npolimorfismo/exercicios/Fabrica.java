package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Boleto;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.CartaoCredito;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Pix;

public class Fabrica {
    private String nome;

    public static void pix(String nome, double valor) {
        if (nome.equalsIgnoreCase("pix")) {
            System.out.println("Valor a ser processado.. " + new Pix().processar(valor));
            System.out.println("PIX PROCESSADO COM SUCESSO!");

        }
    }

    public static void cartaoCredito(String nome, double valor) {
        if (nome.equalsIgnoreCase("cartao de credito")) {
            System.out.println("Valor a ser processado.. " + new CartaoCredito().processar(valor));
            System.out.println("CARTAO DE CREDITO ACEITO COM SUCESSO!");

        }
    }

    public static void boleto(String nome, double valor) {
        if (nome.equalsIgnoreCase("boleto")) {
            System.out.println("Valor a ser processado.. " + new Boleto().processar(valor));
            System.out.println("BOLETO REALIZADO COM SUCESSO!");

        }
    }

}
