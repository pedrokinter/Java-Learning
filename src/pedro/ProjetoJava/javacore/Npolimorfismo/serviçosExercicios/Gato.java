package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Animal;

public class Gato extends Animal {
    private String nome;
    private String cor;

    public Gato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    @Override
    public String  falar() {
        return "MIAUUUUUUU";
    }

    @Override
    public String nome() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
