package pedro.ProjetoJava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatTEST {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[7];
        dateFormats[0] = DateFormat.getInstance(); // s.o
        dateFormats[1] = DateFormat.getDateInstance(); // s.o mas com ata
        dateFormats[2] = DateFormat.getDateTimeInstance(); // s.o com data abreivando mes
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
