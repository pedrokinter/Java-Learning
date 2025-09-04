package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Funcionario;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Desenvolvedor;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Estagiario;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Gerente;

import java.util.ArrayList;

public class funcionarios003 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Gerente", 4000.0, 1000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Desenvolvedor", 2500.0, 400.0);
        Funcionario estagiario = new Estagiario("Estagiario", 1300.0, 150.0);

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);
        funcionarios.add(estagiario);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("O " + funcionario.obterNome() + " Recebe um salário de: R$" +  funcionario.calcularSalario());
            System.out.println("=-=-=-=-=-=-=-=-=-=-");

        }

    }
}
