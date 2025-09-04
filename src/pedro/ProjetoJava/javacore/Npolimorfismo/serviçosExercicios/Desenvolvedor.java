package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Funcionario;

public class Desenvolvedor extends Funcionario {
    private String nome;
    private Double salarioBase;
    private Double bonus;

    public Desenvolvedor(String nome, Double salarioBase, Double bonus) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String obterNome() {
        return nome;
    }
}
