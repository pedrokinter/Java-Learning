package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<Manga>();

        mangas.add(new Manga(5L, "DragonBall", 30.25, 0));
        mangas.add(new Manga(8L, "Berserk", 60.5, 1));
        mangas.add(new Manga(9L, "Death Note", 40.2, 5));
        mangas.add(new Manga(10L, "Naruto", 60.0, 0));
        mangas.add(new Manga(11L, "Vagabond", 30.20, 10));
        mangas.add(new Manga(12L, "Jojo", 20.50, 3));


    }
}
