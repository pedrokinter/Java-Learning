package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeDiasInput = input.nextInt();

        int idadeAnos = idadeDiasInput / 365;
        int idadeMes = (idadeDiasInput - (365*idadeAnos)) / 30;
        int idadeDias = (idadeDiasInput - (365*idadeAnos)) % 30;

        System.out.println(idadeAnos + " ano (s) \n"
        + idadeMes + " mes(es) \n" + idadeDias + " dia (s)");
    }
}
