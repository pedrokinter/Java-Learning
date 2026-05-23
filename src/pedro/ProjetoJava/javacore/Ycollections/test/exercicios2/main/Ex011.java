package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex011.Biblioteca;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex011.Livro;

public class Ex011 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("12313", "livro1", "pedro", true);
        Livro livro2 = new Livro("22222", "livro2", "maria", true);
        Livro livro3 = new Livro("123", "livro1", "pedro", false);
        Livro livro4 = new Livro("4444", "livro3", "gabriel", true);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        biblioteca.emprestarLivro(livro1.getIsbn(), "pires");
        biblioteca.emprestarLivro(livro2.getIsbn(), "pires");

        System.out.println(biblioteca.listarDisponiveis());
        System.out.println();
        System.out.println(biblioteca.historicoUsuario("pires"));

        System.out.println();
        biblioteca.devolverLivro(livro1.getIsbn(), "pires");
        System.out.println(biblioteca.listarDisponiveis());
    }
}
