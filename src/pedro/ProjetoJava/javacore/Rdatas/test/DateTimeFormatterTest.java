package pedro.ProjetoJava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        String s1 = d1.format(java.time.format.DateTimeFormatter.ISO_DATE);
        String s2 = d1.format(java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = d1.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        LocalDate p1 = LocalDate.parse("20230425", java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(p1);


        DateTimeFormatter BRAZIL = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(BRAZIL);


    }
}
