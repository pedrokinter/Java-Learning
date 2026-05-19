package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("a", "ana");
        map.put("b", "banana");
        map.put("c", "carlos");
        map.put("d", "daniel");

        for (NavigableMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        } // funciona tanto assim quanto com o Map

        System.out.println(map.headMap("c"));
    }
}
