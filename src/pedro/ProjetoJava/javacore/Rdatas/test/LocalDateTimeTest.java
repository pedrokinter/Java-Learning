package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime test = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2020-01-01");
        LocalTime time = LocalTime.parse("10:30");

        LocalDateTime testeDefinitivo = date.atTime(time);
    }
}
