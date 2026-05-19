package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios;

import java.time.LocalTime;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    private LocalTime horarioDeChegada;

    public Cliente(String nome, LocalTime horarioDeChegada) {
        this.nome = nome;
        this.horarioDeChegada = horarioDeChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public void setHorarioDeChegada(LocalTime horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.horarioDeChegada.compareTo(o.horarioDeChegada);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", horarioDeChegada=" + horarioDeChegada +
                '}';
    }
}
