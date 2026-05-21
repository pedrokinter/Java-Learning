package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.*;

public class Ex005 {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();

        emails.add("pedrohenrique@gmail.com");
        emails.add("gabrielmagno@gmail.com");
        emails.add("pedrohenrique@gmail.com");
        emails.add("joaovitor@outlook.com");
        emails.add("tikomonakama201@gmail.com");
        emails.add("paidopedro@bol.com");
        emails.add("paidopedro@bol.com");
        emails.add("alemao@outlook.com");
        emails.add("zezin@gmail.com");

        System.out.println(emailsSemDuplicatas(emails));
        System.out.println("-----");
        System.out.println(emailsOrdemAlfabetica(emails));
    }

    public static List<String> emailsSemDuplicatas(List<String> emails) {
        Set<String> emailsSemDuplicatas = new LinkedHashSet<>(); // linkedhashset mantem a ordem de inserção
        // e a interface set e linkedhashset não aceitam duplicatas, então é so transformar de list para set e jaera
        // sem contar q tbm preserva a ordem de inserção
        emailsSemDuplicatas.addAll(emails);

        return List.copyOf(emailsSemDuplicatas);

        // melhor retornar lista para manter o contrato e não quebrar a ordem de inserção
    }

    public static NavigableSet<String> emailsOrdemAlfabetica(List<String> emails) {
        NavigableSet<String> emailsOrdemAlfabetica = new TreeSet<>();
        emailsOrdemAlfabetica.addAll(emails);
        // descobri sem querer que o navigableSet ja organiza string por ordem alfabetica automaticamente
        // se bem q eu tinha visto isso pelo sort ja, so faltou me lembrar antes
        // otimo, e ainda mantém organizado certinho
        return emailsOrdemAlfabetica;
    }
}
