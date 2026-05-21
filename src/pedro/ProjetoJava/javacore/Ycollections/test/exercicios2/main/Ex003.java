package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.*;


public class Ex003 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("relatorio.pdf");
        list.add("imagem.png");
        list.add("relatorioQuatro.pdf");
        list.add("pedro.png");
        list.add("pedra.jpg");
        list.add("aaaa.jpg");
        list.add("3123124.jpg");


        System.out.println(removerComIterator(list));
        System.out.println(removerComIf(list));
    }

    public static String removerComIterator(List<String> list) {
        Iterator<String> iteratorPng = list.iterator();

        while (iteratorPng.hasNext()) {
            String nome = iteratorPng.next();  // puxa o next pra string Nome
            if (nome.contains(".png")) {
                iteratorPng.remove(); // se tiver .png ela ja remove, se não continua
            }

            if (nome.contains(".jpg")) { // se não tiver .jpg ele ignora e refaz o loop
                iteratorPng.remove(); // se tiver ja remove
                if (iteratorPng.hasNext()) { // confere se o iterator tem mais item
                    if (iteratorPng.next().contains(".jpg")) { // se tiver, confere se o proximo item tem jpg
                        // se nao tiver jpg, ignora e segue o loop
                        iteratorPng.remove();
                        // se tiver ja remove
                    }
                }
            }

            // nao entendi direito o porque do if aninhado não estar funcionando, mas assim que eu tirei ele
            // do aninhamento funcionou, então é isso
        }
        return list.toString();
    }

    public static String removerComIf(List<String> list) {
        list.removeIf(arquivo -> arquivo.length() < 10);

        String[] array = list.toArray(new String[0]);
        return Arrays.toString(array);
    }
}
