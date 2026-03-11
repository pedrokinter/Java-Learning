package pedro.ProjetoJava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTEST {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");

        NumberFormat nf = NumberFormat.getInstance(localePT);
        double valor = 10_000.231;
        System.out.println(nf.format(valor));
    }
}
