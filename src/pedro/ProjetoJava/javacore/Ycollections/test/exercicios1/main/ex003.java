package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Produto;

public class ex003 {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 30.0, 5);
        Produto produto1 = new Produto("Feijao", 10.0, 2);
        Produto produto2 = new Produto("Macarrao", 5.0, 3);
        Produto produto3 = new Produto("Bacon", 7.0, 7);
        Produto produto4 = new Produto("Carne", 40.5, 10);

        Produto.adicionarProduto(produto);
        Produto.adicionarProduto(produto1);
        Produto.adicionarProduto(produto2);
        Produto.adicionarProduto(produto3);
        Produto.adicionarProduto(produto4);

        Produto.removerProdutoCodigo(10);
        System.out.println(Produto.retornarListaValorAcima(10));

        System.out.println(Produto.getProdutos());
    }
}
