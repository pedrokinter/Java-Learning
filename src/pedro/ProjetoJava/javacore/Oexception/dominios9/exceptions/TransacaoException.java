package pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions;


import pedro.ProjetoJava.javacore.Oexception.dominios9.model.TipoErro;

public class TransacaoException extends Exception{
    private TipoErro tipoErro;

    public TransacaoException(String message, TipoErro tipoErro) {
        super(message + tipoErro.toString());
        this.tipoErro = tipoErro;
    }

    public TipoErro getTipoErro() {
        return tipoErro;
    }

}
