package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Consumidor;
import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Pedro");
        Consumidor consumidor2  = new Consumidor("Maria");

        Manga manga1 = new Manga(5L, "DragonBall", 30.25);
        Manga manga2 = new Manga(8L, "Berserk", 60.5);
        Manga manga3 = new Manga(9L, "Death Note", 40.2);
        Manga manga4 = new Manga(10L, "Naruto", 60.0);
        Manga manga5 = new Manga(11L, "Vagabond", 30.20);


        List<Manga> mangas = List.of(manga1, manga2, manga3);
        Map<Consumidor, List<Manga>> consumidorMangaHashMap = new HashMap<>();
        consumidorMangaHashMap.put(consumidor1, mangas);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaHashMap.entrySet()) {
            System.out.println("Mangas do "+entry.getKey().getNome() + ": ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }

    }
}
