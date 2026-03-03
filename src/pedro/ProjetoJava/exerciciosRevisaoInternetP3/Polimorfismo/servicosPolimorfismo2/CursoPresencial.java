package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Curso;

public class CursoPresencial extends Curso {
    private int aulasFrequentadas;
    private int totalAulas;

    public CursoPresencial(String titulo, int cargaHoraria, String aluno, int aulasFrequentadas, int totalAulas) {
        super(titulo, cargaHoraria, aluno);
        this.aulasFrequentadas = aulasFrequentadas;
        this.totalAulas = totalAulas;
    }

    @Override
    public double calcularProgresso() {
        return (double) aulasFrequentadas / totalAulas * 100;
    }

    @Override
    public double calcularNota() {
        return calcularProgresso() / 10;
    }

    @Override
    public String getConceito() {
        if (calcularNota() < 10 && calcularNota() >= 7){
            return "Aprovado";
        }  else if (calcularNota() < 7 && calcularNota() >= 5){
            return "Recuperacao";
        }
        return "Reprovado";
    }

    @Override
    public void emitirCertificado() {
        if (elegivelCertificado()){
            System.out.println("Certificado do curso presencial emitido com sucesso!!");
        } else {
            System.out.println("O aluno não está elegivel para o certificado!!");
        }
    }

    @Override
    public boolean elegivelCertificado() {
        if (calcularProgresso() >= 80){
            return true;
        }
        return false;
    }

    public int getAulasFrequentadas() {
        return aulasFrequentadas;
    }

    public void setAulasFrequentadas(int aulasFrequentadas) {
        if (aulasFrequentadas < 0){
            System.out.println("erro, aulas frequentadas nulo");
            return;
        }
        this.aulasFrequentadas = aulasFrequentadas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        if (totalAulas < 0){
            System.out.println("erro, total de aulas nulo");
            return;
        }
        this.totalAulas = totalAulas;
    }
}
