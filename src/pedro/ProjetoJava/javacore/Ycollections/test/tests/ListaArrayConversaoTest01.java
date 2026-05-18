package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> listaArray = Arrays.asList(numerosArray);
        listaArray.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(listaArray);

        System.out.println("-------------");
        List<Integer> numerosComListOf = new ArrayList<>(List.of(numerosArray));
        List<Integer> numerosComArraysAsList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosComListOf.add(1);
        numerosComArraysAsList.add(2);
        System.out.println(numerosComListOf);
        System.out.println(numerosComArraysAsList);
    }
}
