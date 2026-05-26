package pedro.ProjetoJava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest01 {
    private String nome = "pedro";

    class Inner{
        public void imprime(){
            System.out.println(nome);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 obj = new OuterClassesTest01();
        Inner inner = obj.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.imprime();
        inner2.imprime();
    }
}
