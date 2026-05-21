package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.ArrayList;

import java.util.Arrays;
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
        System.out.println("Array normal sem ser ordenado e com negativos: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("--------------");
        System.out.println("Array ordenado e com negativos: ");
        System.out.println(Arrays.toString(removerComIf(numeros)));
    }

    public static Integer[] removerComIf(int[] numeros){
        List<Integer> listaNumeros = new ArrayList<>();

        for(int numero : numeros){
            listaNumeros.add(numero);
        }

        listaNumeros.removeIf(numero1 -> numero1 < 0);

        listaNumeros.sort(new numsDecrescente());



        return listaNumeros.toArray(new Integer[0]);
        // tentei fazer com o tipo primitivo int mas não ia de nenhuma maneira, então preferi passar com Integer
        // pra facilitar o trabalho, até pq arraylist precisa de um objeto
    }
}
