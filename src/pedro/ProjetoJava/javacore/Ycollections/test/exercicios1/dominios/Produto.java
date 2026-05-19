package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios;

import java.util.*;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    private static List<Produto> produtos = new ArrayList<>(); // colocar lista em outra classe ou no main

    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static void adicionarProduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.add(produto);
        } else {
            throw new IllegalArgumentException("produto já existente ou nulo!");
        }
    }

    public static void removerProdutoCodigo(int codigo) {
        if (codigo >= 0) {
            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).getCodigo() == codigo) {
                    produtos.remove(i);
                    break;
                }
            }
        }
    }

    public static List<Produto> retornarListaValorAcima(double preco) {
        List<Produto> valorAcima = new ArrayList<>();
            for (Produto produto1 : produtos) {
                if (produto1.getPreco() > preco) {
                    valorAcima.add(produto1);
                }
            }


        valorAcima.sort(Comparator.comparing(Produto::getPreco)); // entender isso aqui

        return valorAcima;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return this.codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }
}
