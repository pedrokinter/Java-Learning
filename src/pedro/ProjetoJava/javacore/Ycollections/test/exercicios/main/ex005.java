package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Jogador;

import java.util.ArrayList;
import java.util.Collections;

public class ex005 {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Pedro", 25));
        jogadores.add(new Jogador("Pablo", 30));
        jogadores.add(new Jogador("Petrucio", 35));
        jogadores.add(new Jogador("Paulo", 40));
        jogadores.add(new Jogador("Patricio", 1));

        Collections.sort(jogadores);
        int i = 0;
        for (Jogador jogador : jogadores) {
            i++;
            System.out.println(i+ "º " + jogador);

        }
    }
}
