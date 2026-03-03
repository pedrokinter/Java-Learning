package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Cirurgico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Funcionario;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Medico;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo5.Prescricivel;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.Enfermeiro;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.MedicoCirurgiao;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo5.MedicoClinico;

import java.util.Arrays;

public class exercicioP312 {
    public static void main(String[] args) {
        MedicoClinico medicoClinico = new MedicoClinico("Matheus", "1324141415", "Clinico",
                5);

        MedicoCirurgiao medicoCirurgiao = new MedicoCirurgiao("Pedro", "142556667", "Cirurgiao",
                4);

        Enfermeiro enfermeiro = new Enfermeiro("Gabriel", "1425667889", "Enfermeiro");

        Funcionario[] funcionarios = new Funcionario[]{medicoClinico, medicoCirurgiao, enfermeiro};
        String[] a = new String[5];
        a[0] = "remedio1";
        a[1] = "remedio2";
        a[2] = "remedio3";

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                funcionario.exibirDados();

                funcionario.realizarAtendimento("Guilherme");
                if (funcionario instanceof Cirurgico cirurgico) {
                    cirurgico.realizarCirurgia("Coração");
                    System.out.println("Total de cirurgias do " + funcionario.getNome() + ": " +
                            cirurgico.getTotalCirurgias());
                }
                if (funcionario instanceof Prescricivel prescricivel) {

                    prescricivel.prescreverMedicamento("ibipirona");
                    prescricivel.prescreverMedicamento("ibuprofone");
                    prescricivel.prescreverMedicamento("amoxilina");
                    System.out.println(Arrays.toString(prescricivel.getPrescricoes()));
                }
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }

        }
    }
}
