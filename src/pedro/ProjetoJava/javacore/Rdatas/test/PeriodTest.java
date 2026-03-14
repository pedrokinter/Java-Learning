package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(now, now.plusDays(1));
        System.out.println(period);
    }
}
