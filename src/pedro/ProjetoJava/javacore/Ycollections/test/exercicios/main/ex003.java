package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Produto;

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

        // tirar do estatico
        // tirar lista de dentro da classe
        // mas deixar os metodos
        // talvez criar uma class de lista somente pra isso

        System.out.println(Produto.getProdutos());
    }
}
