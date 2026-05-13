package pedro.ProjetoJava.javacore.Ycollections.test.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<String>();
        mangas.add("dragon ball");
        mangas.add("hunterxhunter");
        mangas.add("death note");
        mangas.add("naruto");
        mangas.add("berserk");
        mangas.add("pokemon");

        Collections.sort(mangas);

        for (String s : mangas) {
            System.out.println(s);
        }


    }
}
