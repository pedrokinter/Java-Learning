package pedro.ProjetoJava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {
    private String nome = "Midoriya";

    void print() {
        String sobrenome = "Pedro";
        class ClasseLocal{
            public void printLocal() {
                System.out.println(nome);
            }
        }
        new ClasseLocal().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 obj = new OuterClassesTest02();
        obj.print();
    }
}
