package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios7.ImportadorProduto;
import pedro.ProjetoJava.javacore.Oexception.dominios7.RepositorioProduto;
import pedro.ProjetoJava.javacore.Oexception.dominios7.ServicoProduto;

import java.sql.SQLException;

public class exercicio07 {
    public static void main(String[] args) {
        ImportadorProduto imp = new ImportadorProduto();
        RepositorioProduto banco = new RepositorioProduto();

        imp.setNome("produto servico");
        ServicoProduto sp = new ServicoProduto(imp);
        ImportadorProduto imp2 = new ImportadorProduto();


        imp.setPreco(100);
        imp.setQuantidade(10);

        try{
            banco.bancoDeDados();
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro no banco de dados! " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
