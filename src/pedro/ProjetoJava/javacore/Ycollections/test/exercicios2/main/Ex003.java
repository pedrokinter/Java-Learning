package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.*;


public class Ex003 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("relatorio.pdf");
        list.add("imagem.png");
        list.add("pedro.png");
        list.add("pedro.jpg");


        System.out.println(removerComIterator(list));
        System.out.println(removerComIf(list));
    }

    public static String removerComIterator(List<String> list) {
        Iterator<String> iteratorPng = list.iterator();
        Iterator<String> iteratorJpg = list.iterator();

        while (iteratorPng.hasNext()) {
            if(iteratorPng.next().contains(".png")){
                iteratorPng.remove();
            }
        }
        return list.toString();
    }

    public static String removerComIf(List<String> list) {
        list.removeIf(arquivo -> arquivo.length() < 10);

        String[] array = list.toArray(new String[0]);
        return Arrays.toString(array);
    }
}
