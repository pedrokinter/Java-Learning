package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex010;

import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Objects;

public class Paciente implements Comparable<Paciente>{
    private String nome;
    private int idade;
    private Prioridade prioridade;

    public Paciente(String nome, int idade, Prioridade prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.prioridade = prioridade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", prioridade=" + prioridade +
                '}';
    }



    @Override
    public int compareTo(Paciente o) {
        int prio = o.getPrioridade().compareTo(this.prioridade);
        if (prio != 0) return prio;
        // nao entendi, vou retornar depois, pq ele nao ta organizando pela ordem ordinal dos enums
        // e eu tambem to achando que é mais facil implementar um Comparator do que o Comparable
        // masjaja eu vejo isso
        return Integer.compare(o.getIdade(), this.idade);
    }
}
