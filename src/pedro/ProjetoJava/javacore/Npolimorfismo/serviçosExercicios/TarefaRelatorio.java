package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Tarefa;

public class TarefaRelatorio extends Tarefa {
    public TarefaRelatorio(String descricao, String prioridade) {
        super(descricao, prioridade);
    }

    @Override
    public void executar() {
        super.executar();
    }
}
