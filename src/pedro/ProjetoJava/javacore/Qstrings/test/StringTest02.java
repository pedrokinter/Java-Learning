package pedro.ProjetoJava.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "pires";
        String nums = "1231561";
        String spacesBlank = "        aaaaaaaaaa     ";
        System.out.println(nome.substring(2));
        System.out.println(spacesBlank.trim());
        System.out.println(nums.replace("1", "btw"));
    }
}
