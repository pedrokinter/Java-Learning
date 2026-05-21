package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.HashMap;
import java.util.Map;

public class Ex007 {
    public static void main(String[] args) {
        String texto = "aaaaabb";
        contadorDePalavras(texto);
    }

    public static void contadorDePalavras(String texto){
        int contagem = 0;
        Map<Character, Integer> palavras = new HashMap<>();
        for (int i = 0; i < texto.length(); i++) {
            palavras.put(texto.charAt(i), contagem);
        }
    }
}
