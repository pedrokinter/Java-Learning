package pedro.ProjetoJava.javacore.ZZAclassesInternas.test;


import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("canoa"), new Barco("arlo")));
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getMarca().compareTo(o2.getMarca());
            }
        });

        System.out.println(barcos.get(0).getMarca());
        System.out.println(barcos.get(1).getMarca());
    }
}
