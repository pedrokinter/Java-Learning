package pedro.ProjetoJava.javacore.Qstrings.test;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        StringTest(100);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao String: " + (fim - inicio) + "ms");
        System.out.println();

        long inicio1 = System.currentTimeMillis();
        StringTestBuilder(100000000);
        long fim1 = System.currentTimeMillis();

        System.out.println("Tempo de execucao StringBuilder: " + (fim1 - inicio1) + "ms");
        System.out.println();

        long inicio2 = System.currentTimeMillis();
        StringTestBuffer(100000000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo de execucao StringBuffer: " + (fim1 - inicio1) + "ms");

    }

    public static void StringTest(int tamanho) {

        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void StringTestBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    public static void StringTestBuffer(int tamanho) {
        StringBuffer texto1 = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            texto1.append(i);
        }
    }
}
