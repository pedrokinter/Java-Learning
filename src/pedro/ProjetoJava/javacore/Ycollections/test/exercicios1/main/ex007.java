package pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Estudante;
import pedro.ProjetoJava.javacore.Ycollections.test.exercicios1.dominios.Turma;

public class ex007 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Pedro", 12, 8.6);
        Estudante estudante2 = new Estudante("Ana", 14, 2.0);
        Estudante estudante3 = new Estudante("Kayke", 28, 9);
        Estudante estudante4 = new Estudante("Wesley", 102, 4.5);
        Estudante estudante5 = new Estudante("Paulo", 10, 3.0);
        Estudante estudante6 = new Estudante("Patricio", 8, 10);
        Estudante estudante7 = new Estudante("Gabriel", 14, 6.5);

        Turma turma = new Turma();
        turma.adicionarAluno(estudante1);
        turma.adicionarAluno(estudante2);
        turma.adicionarAluno(estudante3);
        turma.adicionarAluno(estudante4);
        turma.adicionarAluno(estudante5);
        turma.adicionarAluno(estudante6);
        turma.adicionarAluno(estudante7);


        System.out.println("----------------------");
        System.out.println(turma.aprovados());
        System.out.println("----------------------");
        System.out.println(turma.reprovados());
        System.out.println("----------------------");
        System.out.println(turma.calcularMedia());

    }
}
