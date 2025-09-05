package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Pagamento;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Boleto;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.CartaoCredito;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Pix;

import java.util.Scanner;

public class pagamento006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorAPagar = 2000;

        System.out.println("Você tem um valor devendo a ser pago: " +valorAPagar);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Escolha uma forma de pagamento (pix, cartao de credito, boleto): ");
        String formaDePagamento = ler.nextLine().toLowerCase();

        switch (formaDePagamento) {
            case "pix":
                Fabrica.pix(formaDePagamento, valorAPagar);
                break;
            case "cartao de credito":
                Fabrica.cartaoCredito(formaDePagamento, valorAPagar);
                break;
            case "boleto":
                Fabrica.boleto(formaDePagamento, valorAPagar);
                break;
            default:
                break;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");



    }
}
