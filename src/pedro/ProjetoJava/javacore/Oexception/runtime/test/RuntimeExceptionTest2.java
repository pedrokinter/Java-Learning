package pedro.ProjetoJava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        System.out.println(test(10, 0));

    }

    private static int test(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("A and B are 0");
        }
        return  a/b;

    }
}
