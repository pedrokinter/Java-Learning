package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Voador;

public class Pato implements Voador {
    private String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void voar() {
        System.out.println("O " + nome + " ESTÁ VOANDO!!");



    }
}
