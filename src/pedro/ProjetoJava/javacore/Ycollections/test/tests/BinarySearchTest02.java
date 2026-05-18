package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "DragonBall", 30.25));
        mangas.add(new Manga(8L, "Berserk", 60.5));
        mangas.add(new Manga(9L, "Death Note", 40.2));
        mangas.add(new Manga(10L, "Naruto", 60.0));
        mangas.add(new Manga(11L, "Vagabond", 30.20));
        mangas.add(new Manga(12L, "Jojo", 20.50));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaBinarySearch = new Manga(5L, "DragonBall", 30.25);

        System.out.println(Collections.binarySearch(mangas, mangaBinarySearch));
    }
}
