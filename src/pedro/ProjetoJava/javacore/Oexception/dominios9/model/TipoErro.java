package pedro.ProjetoJava.javacore.Oexception.dominios9.model;

public enum TipoErro {
    SALDO_INSUFICIENTE,
    CONTA_INATIVA,
    VALOR_NEGATIVO;
    private static int saldoInsuficiente;
    private static int contaInativa;
    private static int valorNegativo;

    public static int getSaldoInsuficiente() {
        return saldoInsuficiente;
    }

    public static void setSaldoInsuficiente(int saldoInsuficiente) {
        if (saldoInsuficiente < 0)
            return;
        TipoErro.saldoInsuficiente += saldoInsuficiente;
    }

    public static int getContaInativa() {
        return contaInativa;
    }

    public static void setContaInativa(int contaInativa) {
        if (contaInativa < 0)
            return;
        TipoErro.contaInativa += contaInativa;
    }

    public static int getValorNegativo() {
        return valorNegativo;
    }

    public static void setValorNegativo(int valorNegativo) {
        if (valorNegativo < 0)
            return;
        TipoErro.valorNegativo += valorNegativo;
    }
}
