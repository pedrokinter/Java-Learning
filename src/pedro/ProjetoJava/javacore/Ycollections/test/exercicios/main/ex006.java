package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Agenda;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Contato;

public class ex006 {
    public static void main(String[] args) {
        Contato contato = new Contato("Maria", "(11) 2257-2644");
        Contato contato1 = new Contato("Joao", "(15) 2356-1104");
        Contato contato2 = new Contato("Pedro", "(15) 4769-3844");
        Contato contato3 = new Contato("Gabriel", "(16) 8862-6885");
        Contato contato4 = new Contato("Pedro Pires", "(15) 3384-5184");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato);
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.adicionarContato(contato4);

        agenda.buscarContatoPorNome("Pedro");

        System.out.println("--------");

        agenda.removerContatoPorTelefone("(15) 3384-5184");

        agenda.buscarContatoPorNome("Pedro");

    }
}
