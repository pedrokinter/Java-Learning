package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("c");
        fila.add("a");
        fila.add("b");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
