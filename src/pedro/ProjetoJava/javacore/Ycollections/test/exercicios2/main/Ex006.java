package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.*;

public class Ex006 {
    public static void main(String[] args) {
        NavigableSet<Double> temperaturas = new TreeSet<>();

        temperaturas.add(12.0);
        temperaturas.add(20.0);
        temperaturas.add(21.0);
        temperaturas.add(23.2);
        temperaturas.add(25.6);
        temperaturas.add(26.0);
        temperaturas.add(29.6);
        temperaturas.add(30.0);
        temperaturas.add(32.2);
        temperaturas.add(50.0);

        System.out.println("Maior temperatura abaixo de 30 graus: ");
        System.out.println(maiorAbaixo30(temperaturas));
        System.out.println();

        System.out.println("Menor temperatura acima de 25 graus: ");
        System.out.println(menorAcima25(temperaturas));
        System.out.println();

        System.out.println("temperaturas entre 20 e 28 graus: ");
        System.out.println(temperaturasEntre20e28(temperaturas));
        System.out.println();

        System.out.println("anterior e posterior a 30 graus: ");
        System.out.println(anteriorEPosterior(temperaturas, 30.0)); // arrumar essa aqui
        System.out.println();
    }

    public static Double maiorAbaixo30(NavigableSet<Double> temperaturas) {
        Double maior;

        if (temperaturas.isEmpty()) {
            throw new IllegalArgumentException("Temperaturas vazias!!");
        }

        maior = temperaturas.lower(30.0);

        return maior;
    }

    public static Double menorAcima25(NavigableSet<Double> temperaturas) {
        Double menor;

        if (temperaturas.isEmpty()) {
            throw new IllegalArgumentException("Temperaturas vazias!!");
        }

        menor = temperaturas.higher(25.0);

        return menor;
    }

    public static NavigableSet<Double> temperaturasEntre20e28(NavigableSet<Double> temperaturas) {

//        for (Double temperatura : temperaturas) {
//            if (temperatura >= 20 && temperatura <= 28) {
//                lista.add(temperatura);
//            }
//        }

        return temperaturas.subSet(20.0, true, 28.0, true);

    }

    public static List<Double> anteriorEPosterior(NavigableSet<Double> temperaturas, double temperatura) {
        List<Double> lista = new ArrayList<>();


        lista.add(temperaturas.higher(temperatura));
        lista.add(temperaturas.lower(temperatura));
        return lista;
    }
}
