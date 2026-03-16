package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        today = today.with(ChronoField.DAY_OF_MONTH, 10);

        today = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(today);
    }
}
