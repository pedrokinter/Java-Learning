package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios6.ConexaoBanco;
import pedro.ProjetoJava.javacore.Oexception.dominios6.TransacaoBanco;

public class exercicio06 {
    public static void main(String[] args) {

        try (
        TransacaoBanco transacao = new TransacaoBanco(); ConexaoBanco banco = new ConexaoBanco()){

            transacao.executarOperacao();
        } catch (Exception e) {
            System.out.println("Exceção primaria e não suprimida!! : " + e.getMessage());
            System.out.println();
            System.out.println("Exceções suprimidas!");
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println(throwable.getMessage());
            }
        }
    }
}
