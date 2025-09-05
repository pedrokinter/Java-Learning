package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Tarefa;

public class TarefaEmail extends Tarefa {

    public TarefaEmail(String descricao, String prioridade) {
        super(descricao, prioridade);
    }

    @Override
    public void executar() {
        super.executar();
    }
}
