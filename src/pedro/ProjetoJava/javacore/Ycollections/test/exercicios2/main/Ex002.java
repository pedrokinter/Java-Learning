package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex002 {
    public static void main(String[] args) {
        Produto p1 = new Produto("bola", 10.0, 10);
        Produto p2 = new Produto("guarda chuva", 12.0, 12);
        Produto p3 = new Produto("trento", 6.0, 5);
        Produto p4 = new Produto("lacta", 20.0, 2);
        List<Produto> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        produtos.sort(Comparator.comparing(Produto::getCodigo));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
