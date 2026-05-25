package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistroSenhas {
    private List<Senha> senhas = new ArrayList<>();

    public void adicionar(Senha s) {
        if (s.getUsuario() == null || s.getValor() == null) {
            throw new IllegalArgumentException("usuario e/ou senha em branco ou nulo");
        }

        if (!this.senhas.toString().contains(s.getUsuario())) {
            this.senhas.add(s);
        }
    }

    public Optional<Senha> buscarPorUsuario (Senha s) {
        Optional<Senha> senha = Optional.ofNullable(s);
        if (senha.isEmpty()) {
            throw new IllegalArgumentException("usuario nao esta presente nos registros de senha");
        } else {
            return senha;
        }
    }

    public List<Senha> listar() {
        return this.senhas;
    }

    @Override
    public String toString() {
        return "RegistroSenhas{" +
                "senhas=" + senhas +
                '}';
    }
}
