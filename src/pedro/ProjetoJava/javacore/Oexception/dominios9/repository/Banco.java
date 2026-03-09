package pedro.ProjetoJava.javacore.Oexception.dominios9.repository;

import pedro.ProjetoJava.javacore.Oexception.dominios9.Cliente;

public class Banco {
    private Cliente[] clientes = new Cliente[10];

    public void adicionarCliente(Cliente cliente, int posicao) {
        if (cliente != null) {
            if (clientes[posicao] == cliente) {
                System.out.println("o cliente já está cadastrado");
                return;
            }
            clientes[posicao] = cliente;
        }
    }
}

