package pedro.ProjetoJava.javacore.Oexception.dominios9.service;

import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.RelatorioException;

public class RelatorioService implements AutoCloseable{
    @Override
    public void close() throws RelatorioException {
        System.out.println("fechando serviço do RelatorioService!");
        throw new RelatorioException("Exceção do relatorio p/ demonstrar supressed exceptions!");
    }
}
