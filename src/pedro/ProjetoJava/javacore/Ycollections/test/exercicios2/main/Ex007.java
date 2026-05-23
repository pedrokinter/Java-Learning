package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {

        String texto = "Pedro Henrique Pires Pires 123";
        Map<String, Integer> palavras = contadorDePalavras(texto);

        System.out.println("Quantidade de palavras no  (em ordem alfabética) e quantas vezes elas aparecem: ");
        System.out.println(palavras);


        System.out.println("-------------");

        System.out.println("Palavras que apareceram mais de uma vez: ");
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static Map<String, Integer> contadorDePalavras(String texto) {
        Map<String, Integer> palavras = new TreeMap<>();

        texto = texto.toLowerCase();
        // usei a classe StringTokenizer por ser mais facil de fazer e economizar linhas de codigo
        StringTokenizer stringTokenizer = new StringTokenizer(texto);
        while (stringTokenizer.hasMoreTokens()) {
            String palavra = stringTokenizer.nextToken().replaceAll("[\\p{Punct}\\d]", "");

            if (!palavra.isEmpty()) {
                palavras.put(palavra, palavras.getOrDefault(palavra, 0) + 1);
            }

        }
        return palavras;
    }

}


