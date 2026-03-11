package pedro.ProjetoJava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatLocaleTEST {
    public static void main(String[] args) {
        Locale localeIT = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        System.out.println(df.format(cal.getTime()));
        System.out.println(df2.format(cal.getTime()));
    }
}
