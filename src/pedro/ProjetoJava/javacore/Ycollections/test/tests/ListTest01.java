package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // no parenteses da pra incluir um tamanho previamente dito, sendo que todo
        // número a partir de 16 faz a lista dobrar de tamanho 17 = 32, 18 = 64
        nomes.add("Pedro");
        nomes.add("Ana");
    }
}
