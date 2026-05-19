package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato) {
        if (contato != null &&  !contatos.contains(contato)) {
            contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Contato nulo!");
        }
    }

    public List<Contato> removerContatoPorTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone nulo ou vazio!");
        }

        for (Contato contato1 : contatos) {
            if (contato1.getTelefone().equals(telefone)) {
                contatos.remove(contato1);
                break;
            }
        }
        return contatos;
    }

    public List<Contato> buscarContatoPorNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome nulo ou vazio!");
        }
        List<Contato> contatosPorNome = new ArrayList<>();


        for (Contato contatoBuscado : contatos) {
            if (contatoBuscado.getNome().toLowerCase().contains(nome.toLowerCase())) {
                contatosPorNome.add(contatoBuscado);
            }
        }


        return contatosPorNome;
    }

}
