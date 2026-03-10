package pedro.ProjetoJava.javacore.Qstrings.test;

public class StringBuilder01 {
    public static void main(String[] args) {
        String nome = "Pedro";

        StringBuilder s = new StringBuilder("Pedro");
        s.append(nome).append(" pires");
        System.out.println(s);
    }
}
