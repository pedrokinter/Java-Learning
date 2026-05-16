package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato) {
        if (contato != null) {
            for (Contato contato1 : contatos) {
                if (contato1.getNome().equals(contato.getNome()) && contato1.getTelefone().equals(contato.getTelefone())) {
                    return;
                }
            }
            contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Lista vazia ou contato nulo!");
        }
    }

    public void removerContatoPorTelefone(String telefone) {
        if (contatos != null) {
            for (Contato contato1 : contatos) {
                if (contato1.getTelefone().equals(telefone)) {
                    contatos.remove(contato1);
                    break;
                }
            }
            // contatos.removeIf(contato1 -> contato1.getTelefone().equals(contato.getTelefone()));
        }  else {
            throw new IllegalArgumentException("Lista vazia ou contato nulo, impossivel remover por telefone!");
        }
    }

    public void buscarContatoPorNome(String nome) {
        // inves de buscar com o objeto direto, buscar com a string do nome
        List<Contato> contatosPorNome = new ArrayList<>();
        if (contatos != null) {
            for (Contato contatoBuscado : contatos) {
                if (contatoBuscado.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    contatosPorNome.add(contatoBuscado);
                }
            }
        } else {
            throw new IllegalArgumentException("Lista vazia ou contato nulo!, impossivel buscar por nome");
        }

        for (Contato contatoNomeBuscado : contatosPorNome) {
            System.out.println(contatoNomeBuscado);
        }
    }
}
