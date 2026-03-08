package pedro.ProjetoJava.javacore.Oexception.dominios6;

public class ConexaoBanco implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Erro com banco de dados!");
    }
}
