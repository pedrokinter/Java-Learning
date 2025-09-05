package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Corredor;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Nadador;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Voador;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Cavalo;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Golfinho;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Pato;

import java.util.ArrayList;

public class zoo005 {
    public static void main(String[] args) {
        Voador pato = new Pato("pato-manso");
        Nadador golfinho = new Golfinho("golfinho jack");
        Corredor cavalo = new Cavalo("cavalao");
        System.out.println("=-=-=-=-=-=-=-=-=-");
        listaAnimais(pato, golfinho, cavalo);
        System.out.println("=-=-=-=-=-=-=-=-=-");

    }

    public static void listaAnimais (Voador pato, Nadador golfinho, Corredor cavalo) {
        pato.voar();
        golfinho.nadar();
        cavalo.correr();
    }




}
