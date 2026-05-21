package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Estudante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex008 {
    public static void main(String[] args) {
        Map<String, List<Estudante>> todasAsTurmas = new HashMap<>();
        List<Estudante> turma1 = new ArrayList<>();
        List<Estudante> turma2 = new ArrayList<>();
        List<Estudante> turma3 = new ArrayList<>();
        List<Estudante> turma4 = new ArrayList<>();

        turma1.add(new Estudante("pedro", 232, 8.8));
        turma1.add(new Estudante("pablo", 234, 7.0));
        turma1.add(new Estudante("maria", 220, 6.5));


        turma2.add(new Estudante("gabriel", 102, 10.0));
        turma2.add(new Estudante("mario", 112, 8.0));
        turma2.add(new Estudante("joao", 76, 2.3));

        turma3.add(new Estudante("pedro", 234, 7.0));
        turma3.add(new Estudante("pedro", 234, 8.7));

        turma4.add(new Estudante("ana", 234, 5.0));
        turma4.add(new Estudante("mateus", 234, 7.5));

        todasAsTurmas.put("turma 1", turma1);
        todasAsTurmas.put("turma 2", turma2);
        todasAsTurmas.put("turma 3", turma3);
        todasAsTurmas.put("turma 4", turma4);

        adicionarAlunoATurma(new Estudante("teste", 111, 6.9), null, todasAsTurmas);

        System.out.println("----------------------------------");
        System.out.println("Lista de todas as turmas!!: ");
        listarAlunosDeUmaTurma(todasAsTurmas);

        System.out.println("---------------------------------");
        System.out.println("Escolha uma turma para exibir a média abaixo:");
        System.out.println("Média final da turma escolhida: "+calcularMediaTurma(todasAsTurmas, turma1));
        System.out.println("---------------------------------");


        System.out.println("Nome da turma com a maior média dentre todas as turmas: ");
        System.out.println(nomeTurmaMaiorMedia(todasAsTurmas));
        System.out.println("---------------------------------");
    }

    public static void adicionarAlunoATurma(Estudante estudante, List<Estudante> turma, Map<String, List<Estudante>> turmas) {
        if (estudante == null){
            return;
        }

        if (turma == null) {
            turma = new ArrayList<>();
            turma.add(estudante);
            turmas.put("turma " + turma.size() + 1,  turma);
        } else {
            turma.add(estudante);
        }// acho que aqui ta certo, mas e caso a turma ja estiver adicionada fora do metodo mas nao estar no mapa?
        // to pensando em como resolver isso

    }

    public static void listarAlunosDeUmaTurma(Map<String, List<Estudante>> turma) {
        for (Map.Entry<String, List<Estudante>> entry : turma.entrySet()) {
            System.out.println(entry.getKey()); // entender por que ele ta fazendo da ultima turma invés de fazer pela
            // primeira

            // e agora ele ta fazendo de 2 em 2, nao to entendendo pq n ta em ordem do 1 até o fim
            for (Estudante estudante : entry.getValue()) {
                System.out.println(estudante.getNome());
            }
            System.out.println();
        }

    }

    public static double calcularMediaTurma(Map<String, List<Estudante>> mapa, List<Estudante> turma) {
        double soma = 0;
        for (Map.Entry<String, List<Estudante>> entry : mapa.entrySet()) {
            if (entry.getValue().equals(turma)) {
                for (Estudante estudante : entry.getValue()) {
                    soma += estudante.getNotaFinal();
                }

            }
        }
        return soma / turma.size();
    }

    public static String nomeTurmaMaiorMedia(Map<String, List<Estudante>> mapa) {
        Map<String, Double> mediaTurmas = new HashMap<>();
        double maior = 0;

        // sinto que dava pra fazer isso aqui com menos for's e com menos linhas no geral

        // mas o que importa é que ta funcionando
        for (Map.Entry<String, List<Estudante>> entry : mapa.entrySet()) {
            double soma = 0;
            for (Estudante estudante : entry.getValue()) {
                soma += estudante.getNotaFinal();
            }
            mediaTurmas.put(entry.getKey(), soma / entry.getValue().size());
        }

        for (Map.Entry<String, Double> entry : mediaTurmas.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
            }
        }

        for (Map.Entry<String, Double> entry : mediaTurmas.entrySet()) {
            if (entry.getValue() == maior) {
                return entry.getKey() + "-> média final: " +entry.getValue();
            }
        }

        return "";
    }

}
