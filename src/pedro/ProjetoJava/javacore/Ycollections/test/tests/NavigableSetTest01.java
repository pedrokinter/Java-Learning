package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneComparatorName implements Comparator<Smartphone>
{
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getNome().compareTo(s2.getNome());
    }
}

class SmartphoneComparatorPreço implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return Double.compare(s1.getPreco(), s2.getPreco());
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone>  set = new TreeSet<>(new SmartphoneComparatorPreço());
        Smartphone smartphone = new Smartphone("nokia", "23123124", 100.0);
        Smartphone smartphone2 = new Smartphone("samsung", "24564", 150.0);

        set.add(smartphone);
        set.add(smartphone2);
        set.add(new Smartphone("samsung baixo", "244", 10));

        for (Smartphone smartphone1 : set) {
            System.out.println(smartphone1);
        }

        System.out.println("----------");
        System.out.println(set.lower(smartphone2));
        System.out.println(set.floor(smartphone2));
        System.out.println(set.higher(smartphone2));
        System.out.println(set.ceiling(smartphone2));


    }
}
