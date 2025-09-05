package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Tarefa;

public class TarefaBackup extends Tarefa {
    public TarefaBackup(String descricao, String prioridade) {
        super(descricao, prioridade);
    }

    @Override
    public void executar() {
        super.executar();
    }
}
