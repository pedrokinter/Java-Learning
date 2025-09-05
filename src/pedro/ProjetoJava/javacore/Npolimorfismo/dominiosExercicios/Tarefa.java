package pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios;

public abstract  class Tarefa implements Executavel {
    private String descricao;
    private String prioridade;

    public Tarefa(String descricao, String prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public void executar() {
        System.out.println(descricao + ", " + prioridade);
    }
}
