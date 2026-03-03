package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Avaliavel;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Certificavel;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Curso;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2.CursoHibrido;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2.CursoPresencial;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2.CursoRemoto;

public class exercicioP909 {
    public static void main(String[] args) {
        CursoRemoto ccCOMP = new CursoRemoto("ccCOMP", 3000, "Pedro", 100,
                400);

        CursoPresencial ADS = new CursoPresencial("ADS", 2400, "Mateus",
                200, 300);
        CursoHibrido engSoftware = new CursoHibrido("Eng Software", 3200, "Mathias",
                120,
                200, 60, 200);


        Curso[] cursos = new Curso[]{ccCOMP, ADS, engSoftware};
        for (Curso curso : cursos) {
            System.out.println("Nome do aluno: " + curso.getAluno().toUpperCase());
            System.out.println("Progressão percentual do curso " + curso.getTitulo() + " = " +
                    curso.calcularProgresso() + "%");
            System.out.println("Nota do curso " + curso.getTitulo() + " = " + curso.calcularNota());
            System.out.println("Conceito final: " + curso.getConceito());
            curso.emitirCertificado();


            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
