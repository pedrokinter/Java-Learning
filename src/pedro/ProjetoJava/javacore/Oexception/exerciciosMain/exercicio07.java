package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios7.ErroImportacaoException;
import pedro.ProjetoJava.javacore.Oexception.dominios7.ImportadorProduto;
import pedro.ProjetoJava.javacore.Oexception.dominios7.RepositorioProduto;
import pedro.ProjetoJava.javacore.Oexception.dominios7.ServicoProduto;

import java.sql.SQLException;

public class exercicio07 {
    public static void main(String[] args) {
        ImportadorProduto importador = new ImportadorProduto();
        RepositorioProduto repositorio = new RepositorioProduto();
        ServicoProduto servico = new ServicoProduto();

        try {
            importador.take();
        } catch (ErroImportacaoException e) {
            Throwable cause = e;
            while (cause != null) {
                System.out.println(cause.getMessage()); // imprime a mensagem atual
                cause = cause.getCause(); // desce para a prox msg
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
