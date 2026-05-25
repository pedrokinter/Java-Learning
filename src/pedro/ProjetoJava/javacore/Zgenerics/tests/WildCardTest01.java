package pedro.ProjetoJava.javacore.Zgenerics.tests;

abstract class Animal {
    public abstract void consulta();

}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato(), new Gato()};
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
