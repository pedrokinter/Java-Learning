package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime timeAfter2 = LocalDateTime.now().plusYears(2);


        LocalTime localTime = LocalTime.now();
        LocalTime timeAfter3 = localTime.plusHours(3);



        Duration duration = Duration.between(now, timeAfter2);
        System.out.println(duration);
    }
}
