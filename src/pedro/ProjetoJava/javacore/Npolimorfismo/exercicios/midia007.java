package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Midia;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Audiobook;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Filme;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Musica;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class midia007 {
    public static void main(String[] args) {
        Midia audiobook = new Audiobook("Raiam Santos", 60.0);
        Midia filme = new Filme("Guerra dos Mundos", 120.0);
        Midia musica1 = new Musica("All The Stars", 3.52);
        Midia musica2 = new Musica("Nights", 5.00);
        Midia musica3 = new Musica("Jumpin", 1.32);
        Midia musica4 = new Musica("OVERLY", 2.00);

        ArrayList<Midia> musicas = new ArrayList<Midia>();
        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);
        musicas.add(musica4);

        ArrayList<Midia> midias = new ArrayList<Midia>();

        midias.add(audiobook);
        midias.add(filme);
        midias.add(musica1);
        midias.add(musica2);
        midias.add(musica3);
        midias.add(musica4);
        int cont = 0;

        for (Midia midia : midias) {
                if (midia.equals(musicas.get(cont))) {
                    System.out.println(midia.pegarNome());
                    cont++;
                }

                midias.stream().filter(midia1 -> midia.getDuracao().)
        }
    }
}
