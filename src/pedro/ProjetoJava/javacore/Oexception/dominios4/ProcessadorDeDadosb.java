package pedro.ProjetoJava.javacore.Oexception.dominios4;

public class ProcessadorDeDadosb {
    public  void receberArray(String[] array){
        int [] arrayErro = new int[]{1,2};
        for (String s : array) {
            try {
                Integer.parseInt(s);
                System.out.println(arrayErro[array.length + 1]);

            } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
                e.printStackTrace();

            }
        }
    }
}
