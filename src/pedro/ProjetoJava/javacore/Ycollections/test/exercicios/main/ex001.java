package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Estudante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex001 {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro", 12, 5.6));
        estudantes.add(new Estudante("Maria", 5, 10));
        estudantes.add(new Estudante("Pablo", 29, 7.6));
        estudantes.add(new Estudante("Joao", 20, 2.5));
        estudantes.add(new Estudante("Gabriel", 21, 9.0));

        Estudante teste =  new Estudante("burro", 10, 1.0);
        Estudante pedro =  new Estudante("Pedro", 12, 8.6);

        Estudante.verificarEstudante(teste, estudantes);
        Estudante.verificarEstudante(pedro, estudantes);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-");

        Collections.sort(estudantes);
        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }
    }
}
