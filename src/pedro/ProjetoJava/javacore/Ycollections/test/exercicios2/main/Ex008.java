package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Estudante;

import java.util.*;

public class Ex008 {
    public static void main(String[] args) {
        Map<String, List<Estudante>> todasAsTurmas = new LinkedHashMap<>();
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
        System.out.println("Lista de uma turma especifica: ");
        System.out.println(listarAlunosDeUmaTurma(todasAsTurmas, "turma 1"));
        System.out.println("---------------------------------");
        System.out.println("Escolha uma turma para exibir a média abaixo:");
        System.out.println("Média final da turma escolhida: "+calcularMediaTurma(turma1));
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
            turmas.put("turma " + (turmas.size() + 1),  turma);
        } else {
            turma.add(estudante);
        }
    }

    public static List<Estudante> listarAlunosDeUmaTurma(Map<String, List<Estudante>> turma, String nomeTurma) {

        return turma.get(nomeTurma);
    }

    public static double calcularMediaTurma(List<Estudante> turma) {
        double soma = 0;

        for (Estudante estudante : turma) {
            soma += estudante.getNotaFinal();
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
            if (Double.compare(entry.getValue(), maior) == 0) {
                return entry.getKey() + "-> média final: " +entry.getValue();
            }
        }

        return "";
    }

}
