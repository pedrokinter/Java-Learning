package pedro.ProjetoJava.javacore.Sformatacao.test;

import java.util.Locale;

public class localeTest {
    public static void main(String[] args) {
        String [] isos = Locale.getISOLanguages();
        String [] isos1 = Locale.getISOCountries();

        for (String s : isos) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : isos1) {
            System.out.print(s + " ");
        }
    }
}
