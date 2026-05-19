package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios;

import java.util.Comparator;

class salarioComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return Double.compare(o1.getSalario(), o2.getSalario());
    }
}

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    Comparator<Funcionario> departamentoComparator = new Comparator<Funcionario>() {
        @Override
        public int compare(Funcionario o1, Funcionario o2) {
            return o1.getDepartamento().compareToIgnoreCase(o2.getDepartamento()); // retornar por salario decrescente
            // aq tambem
        }
    };

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}
