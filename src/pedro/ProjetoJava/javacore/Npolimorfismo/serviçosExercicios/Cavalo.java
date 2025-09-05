package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Corredor;

public class Cavalo implements Corredor {
    private String nome;

    public Cavalo(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println("O " + nome + " ESTÁ CORRENDO!!");
    }
}
