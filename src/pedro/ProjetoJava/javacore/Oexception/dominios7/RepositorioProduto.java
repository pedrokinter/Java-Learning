package pedro.ProjetoJava.javacore.Oexception.dominios7;

import java.sql.SQLException;

public class RepositorioProduto {
    public void bancoDeDados() throws Exception{
        throw new SQLException("Erro ao banco de dados");
    }
}
