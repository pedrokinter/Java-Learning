package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("A","1");
        map.put("B","2");
        map.put("C","3");

        for (String s : map.keySet()) {
            System.out.println(s + " - " + map.get(s));
        }

        System.out.println("---------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
