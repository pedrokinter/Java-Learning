package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private int codigo;

    private static List<Produto> produtos = new ArrayList<>();

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
        if (produto != null) {
            for (int i = 0; i <= produtos.size(); i++) {
                if (!produtos.contains(produto)) {
                    produtos.add(produto);
                }
            }
        }
    }

    public void removerProdutoCodigo(int codigo) {
        if (codigo >= 0) {
            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).getCodigo() == codigo) {
                    produtos.remove(i);
                    break;
                }
            }
        }
    }

    public void retornarListaValorAcima(double preco) {
        List<Produto> valorAcima = new ArrayList<>();
        if (produtos != null) {
            for (Produto produto1 : produtos) {
                if (produto1.getPreco() == preco) {
                    valorAcima.add(produto1);
                }
            }
        }

        for (Produto produtoValorAcima : valorAcima) {
            System.out.println(produtoValorAcima);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtos=" + produtos +
                '}';
    }
}
