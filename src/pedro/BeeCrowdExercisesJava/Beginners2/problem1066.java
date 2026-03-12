package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        int [] array = new int[]{A,B,C,D,E};

        for (int i = 0; i < 5; i ++) {
            if (array[i] > 0) {
                positivo++;
            } else if (array[i] < 0) {
                negativo++;
            }

            if (array[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
