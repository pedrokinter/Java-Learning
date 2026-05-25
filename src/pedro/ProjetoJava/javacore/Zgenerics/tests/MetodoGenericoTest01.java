package pedro.ProjetoJava.javacore.Zgenerics.tests;

import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Barco;
import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("barco"));
    }

    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}


