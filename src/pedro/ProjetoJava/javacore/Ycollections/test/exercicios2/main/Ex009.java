package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex009 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> estoque = new LinkedHashMap<>(); // chave nome produto; valor quantidade

        // preferi fazer tudo com void, até por que o exercicio não pede para retornar nada, apenas para adicionar, remover
        // atualizar e listar

        // nenhuma dessas ações devolve valor, logo, void

        adicionar(estoque, "teste", 10);
        adicionar(estoque, "prego", 3);
        adicionar(estoque, "parafusadeira", 10);

        listar(estoque);
        System.out.println("------------------");
        listarPorValor(estoque, 10);
    }

    public static void adicionar(LinkedHashMap<String, Integer> estoque, String nome, int quantidade) {
        if (nome.isBlank() || quantidade < 0) {
            System.out.println("nome vazio ou quantidade menor que zero!");
            return;
        }

        estoque.put(nome, estoque.getOrDefault(nome, 0) + quantidade); // pelo o que eu entendi
        // o getOrDefault faz com que se a chave ja exista  ele soma com o value que ja existe
        // se eu fizer sem isso ele simplesmente substitui
    }


    public static void atualizar(LinkedHashMap<String, Integer> estoque, String nome, int quantidade) {
        if (nome.isBlank() || quantidade < 0) {
            System.out.println("nome vazio ou quantidade menor que zero!");
            return;
        }

        if (estoque.containsKey(nome)) {
            estoque.put(nome, quantidade);
        }
    }


    public static void remover(LinkedHashMap<String, Integer> estoque, String nome) {
        if (nome.isBlank() || estoque.isEmpty()) {
            System.out.println("Estoque vazio ou nome vazio!");
        }
        estoque.remove(nome);
    }

    public static void listar(LinkedHashMap<String, Integer> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }

        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static void listarPorValor(LinkedHashMap<String, Integer> estoque, int quantidade) {
        if (estoque.isEmpty() || quantidade <= 0) {
            System.out.println("Estoque vazio ou quantidade menor igual a zero!");
            return;
        }

        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            if (entry.getValue() < quantidade) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
