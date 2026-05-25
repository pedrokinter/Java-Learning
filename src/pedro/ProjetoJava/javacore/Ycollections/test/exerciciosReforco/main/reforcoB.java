package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.B.Catalogo;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.B.Filme;

public class reforcoB {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Senhor dos aneis", 10.0);
        Filme filme2 = new Filme("teste", 10.0);
        Filme filme3 = new Filme("Matrix", 8.7);
        Filme filme4 = new Filme("Dragon ball", 9.0);
        Filme filme5 = new Filme("Burritos", 3.4);
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarFilme(filme1);
        catalogo.adicionarFilme(filme2);
        catalogo.adicionarFilme(filme3);
        catalogo.adicionarFilme(filme4);
        catalogo.adicionarFilme(filme5);

        System.out.println(catalogo.filmesAcimaDaNota(3.4));
        System.out.println();
        System.out.println(catalogo.melhorFilme());
        System.out.println();
        System.out.println(catalogo.filmeEntreNotas(3.4, 10.0));
    }
}
