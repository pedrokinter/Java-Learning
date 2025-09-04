package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Forma;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Circulo;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Quadrado;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Triangulo;

public class geometric001 {
    public static void main(String[] args) {
        Forma retangulo = new Quadrado(50, 50);
        Forma circulo = new Circulo(25);
        Forma triangulo = new Triangulo(30, 35, 40);

        Forma [] array = {retangulo, circulo, triangulo};

        for (Forma formas : array) {
            System.out.println("=-=-=-=-=-=-=-=-");
            System.out.println("Área do " +formas.getNome()+ " é igual a: " +formas.CalcularArea()+ "m^2");

        }

    }
}
