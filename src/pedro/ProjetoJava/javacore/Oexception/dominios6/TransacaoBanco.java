package pedro.ProjetoJava.javacore.Oexception.dominios6;

public class TransacaoBanco implements AutoCloseable{
    @Override
    public void close() throws Exception {
        executarOperacao();
    }

    public void executarOperacao() throws Exception{
        throw new Exception("Erro executando operacao");
    }
}
