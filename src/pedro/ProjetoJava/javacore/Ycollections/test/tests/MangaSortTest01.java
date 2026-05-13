package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Manga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }


}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "DragonBall", 30.25));
        mangas.add(new Manga(8L, "Berserk", 60.5));
        mangas.add(new Manga(9L, "Death Note", 40.2));
        mangas.add(new Manga(10L, "Naruto", 60.0));
        mangas.add(new Manga(11L, "Vagabond", 30.20));
        mangas.add(new Manga(12L, "Jojo", 20.50));

        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
