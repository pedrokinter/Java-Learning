package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Animal;

public class Vaca extends Animal {
    private String nome;
    private String cor;

    @Override
    public String nome() {
        return nome;
    }

    public Vaca(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public String falar() {
        return "MUUUUUUUUUUUUUUUUU";
    }
}
