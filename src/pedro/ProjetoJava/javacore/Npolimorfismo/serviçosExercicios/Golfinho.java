package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Nadador;

public class Golfinho implements Nadador {
    private String nome;

    public Golfinho(String nome) {
        this.nome = nome;
    }

    @Override
    public void nadar() {
        System.out.println("O " + nome + " ESTÁ NADANDO!!");

    }
}
