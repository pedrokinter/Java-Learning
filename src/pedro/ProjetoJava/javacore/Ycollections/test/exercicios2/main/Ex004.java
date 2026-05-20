package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;


class numsDecrescente implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

public class Ex004 {
    public static void main(String[] args) {
        int[] numeros = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        System.out.println(removerComIf(numeros));
    }

    public static int[]  removerComIf(int[] numeros){
        List<Integer> listaNumeros = new ArrayList<>(List.of());
        for(int numero : numeros){
            listaNumeros.add(numero);
        }

        listaNumeros.removeIf(numero1 -> numero1 < 0);

        listaNumeros.sort(new numsDecrescente());


        int[] a = {0};
        return a;
    }
}
