package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios5.Pagamento;
import pedro.ProjetoJava.javacore.Oexception.dominios5.PagamentoException;
import pedro.ProjetoJava.javacore.Oexception.dominios5.SaldoInsuficienteException;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pagamento p = new Pagamento();
        Pagamento[] pagamentos = new Pagamento[3];

        System.out.println("Insira o valor que vai usar para pagar! ");
        p.setValor(entrada.nextDouble());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Insira o método de pagamento que quer usar! (cartao, boleto ou pix)");
        String opcao = entrada.next();
        if (opcao.equalsIgnoreCase("cartao")) {
            System.out.println("Insira qual cartão que deseja usar!");
            p.setCartao(entrada.next());
        } else if (opcao.equalsIgnoreCase("boleto")) {
            p.setBoleto(opcao);
        } else  if (opcao.equalsIgnoreCase("pix")) {
            System.out.println("Digite a chave pix!");
            p.setPix(entrada.next());
        } else {
            opcao = null;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        p.processarPagamento(opcao);
        System.out.println("Agora, observe o pagamento! ");
        p.exibir();
        System.out.println("=-=-=-=-=-=-=-=-=--=-=-=-=-");
        System.out.println("ARRAYS!!!!!!!!");
        System.out.println("-0=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Pagamento p2 = new Pagamento();
        Pagamento p3 = new Pagamento();

        p2.setValor(500);
        p2.setCartao("cartao");

        p3.setValor(700);
        p3.setBoleto("boleto");

        pagamentos[0] = p;
        pagamentos[1] = p2;
        pagamentos[2] = p3;

        for (Pagamento pagamento : pagamentos) {
            try {
                pagamento.processarPagamento(pagamento.getCartao());
            } catch (PagamentoException | SaldoInsuficienteException e) {
                System.out.println("Erro " + e.getMessage());
                e.printStackTrace();
            }

        }

    }
}
