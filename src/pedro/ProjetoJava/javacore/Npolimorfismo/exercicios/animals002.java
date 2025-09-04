package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Animal;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Cachorro;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Gato;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Vaca;

public class animals002 {
    public static void main(String[] args) {
        Animal gato = new Gato("faisca", "laranja");
        Animal vaca = new Vaca("vaquinha", "preto e branco");
        Animal Cachorro = new Cachorro("caramelo", "hotwailler");

        Animal [] animais = {gato, vaca, Cachorro};
        for (Animal animal : animais) {
            System.out.println("O animal " + animal.nome() + " Falou: " +animal.falar());

        }


    }
}
