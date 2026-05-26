package pedro.ProjetoJava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    static class Nested{
        void print() {
            System.out.println("print");
        }
    }
    public static void main(String[] args) {
        Nested obj = new Nested();
        obj.print();
    }
}
