package pedro.ProjetoJava.javacore.Oexception.dominios7;

import java.sql.SQLException;

public class ServicoProduto{

    public void pegar(){
        try {
            RepositorioProduto repositorio = new RepositorioProduto();
            repositorio.bancoDeDados();
        } catch (SQLException e) {
            throw new ErroRepositorioException("ERRO no serviço!", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
