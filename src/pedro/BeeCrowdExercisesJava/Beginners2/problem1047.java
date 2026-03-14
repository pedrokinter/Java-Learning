package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int IHOUR = in.nextInt();
        int IMINUTE = in.nextInt();
        int FHOUR = in.nextInt();
        int FMINUTE = in.nextInt();

        if (IHOUR > 23 || FHOUR > 23 || IHOUR < 0 || FHOUR < 0) {
            throw new IllegalArgumentException();
        }

        if (IMINUTE < 1 || FMINUTE < 1 || IMINUTE > 59 || FMINUTE > 59) {
            throw new IllegalArgumentException();
        }

        // 7 10
        // 8 09


        int DHOUR = FHOUR - IHOUR;
        int DMINUTE = (DHOUR % 3600);
        DMINUTE /= 60;



        System.out.println("O JOGO DUROU " + DHOUR + " HORAS(S) E " + DMINUTE + " MINUTO(S)");
    }
}
