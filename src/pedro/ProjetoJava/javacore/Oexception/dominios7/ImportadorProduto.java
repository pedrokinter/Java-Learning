package pedro.ProjetoJava.javacore.Oexception.dominios7;

public class ImportadorProduto {
    public void take(){
        try {
            ServicoProduto produto = new ServicoProduto();
            produto.pegar();
        }catch (ErroRepositorioException e){
            throw new ErroImportacaoException("Erro controller! ", e);
        }
    }
}
