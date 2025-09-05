package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Executavel;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Tarefa;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.TarefaBackup;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.TarefaEmail;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.TarefaRelatorio;

import java.util.ArrayList;

public class tarefas004 {
    public static void main(String[] args) {
        Tarefa email = new TarefaEmail("email", "pedro");
        Tarefa backup = new TarefaBackup("backup", "luiz");
        Tarefa relatorio = new TarefaRelatorio("relatorio", "joao");


        ArrayList<Executavel> executaveis = new ArrayList<>();

        executaveis.add(email);
        executaveis.add(backup);
        executaveis.add(relatorio);

        for (Executavel executavel : executaveis) {
            System.out.print("A tarefa: "  );
            executavel.executar();

        }


    }
}
