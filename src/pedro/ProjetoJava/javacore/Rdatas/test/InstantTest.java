package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        instant = instant.plusSeconds(10);
        System.out.println(instant);
    }
}
