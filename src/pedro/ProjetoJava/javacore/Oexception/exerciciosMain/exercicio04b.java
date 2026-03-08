package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios4.ProcessadorDeDadosb;

import java.util.Scanner;

public class exercicio04b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = new String[3];
        ProcessadorDeDadosb pd = new ProcessadorDeDadosb();
        array[0] = "abc";
        array[1] = "123";
        array[2] = null;
        pd.receberArray(array);


    }
}
