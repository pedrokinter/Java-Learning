package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.A;

import java.util.Objects;

public class Senha {
    private String usuario;
    private String valor;

    public Senha(String usuario, String valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Senha senha = (Senha) o;
        return Objects.equals(usuario, senha.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuario);
    }

    @Override
    public String toString() {
        return "Senha{" +
                "usuario='" + usuario + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public String getUsuario() {
        return usuario;
    }

    public String getValor() {
        return valor;
    }
}
