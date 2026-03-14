package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2020, 2, 15, 1, 1);

        System.out.println(ChronoUnit.DAYS.between(ldt, LocalDateTime.now()));
    }
}
