package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("android", "1023134123");
        Smartphone smartphone2 = new Smartphone("iphone", "1ABDE123");
        Smartphone smartphone3 = new Smartphone("windows phone", "SIX7SEVENSIX1023");

        List<Smartphone> lista = new ArrayList<>();

        lista.add(smartphone);
        lista.add(smartphone2);
        lista.add(smartphone3);
        for (Smartphone smartphones : lista) {
            System.out.println(smartphones);
        }
    }
}
