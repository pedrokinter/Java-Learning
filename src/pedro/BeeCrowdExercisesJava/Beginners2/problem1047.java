package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int IHOUR = in.nextInt();
        int IMINUTE = in.nextInt();
        int FHOUR = in.nextInt();
        int FMINUTE = in.nextInt();

        if (IHOUR > 23 ) {
            throw new IllegalArgumentException();
        }

        if (IMINUTE < 1) {
            throw new IllegalArgumentException();
        }

        if (IHOUR == FHOUR) {
            for (int i = 0; i < 24; i++) {
                IHOUR++;
                if (IHOUR == 24) {
                    IHOUR = 0;
                }
            }
            int DHOUR = 24;
        }

        System.out.println(IHOUR);

//        int DHOUR = FHOUR - IHOUR;
//        int DMINUTE = FMINUTE - IMINUTE;
//
//        System.out.println("O JOGO DUROU " +DHOUR+ " HORA(S) E " +DMINUTE+ " MINUTO(S)" );
    }
}
