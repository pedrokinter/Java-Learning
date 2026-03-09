package pedro.ProjetoJava.javacore.Oexception.dominios9;

import pedro.ProjetoJava.javacore.Oexception.dominios9.model.ContaAbstrata;
import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.CpfInvalidoException;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaAbstrata[] contas;

    public Cliente(String nome, String cpf, ContaAbstrata[] listaDeContas) throws CpfInvalidoException {
        this.cpf = cpf.replace(".", "");
        this.cpf = this.cpf.replace("-", "");
        if (this.cpf.length() != 11 || !this.cpf.matches("[0-9]+")) {
            this.cpf = null;
            throw new CpfInvalidoException("O cpf do: "+nome+ " deve ter 11 digitos exatos e somente digitos!");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.contas = listaDeContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            return;
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            return;
        }
        this.cpf = cpf;
    }

    public ContaAbstrata[] getContas() {
        return contas;
    }

    public void setContas(ContaAbstrata[] contas) {
        if (contas == null || contas.length == 0) {
            return;
        }
        this.contas = contas;
    }
}
