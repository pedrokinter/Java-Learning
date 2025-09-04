package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Animal;

public class Cachorro extends Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String falar() {
        return "AUUUUUUUUUUUUU";
    }
}
