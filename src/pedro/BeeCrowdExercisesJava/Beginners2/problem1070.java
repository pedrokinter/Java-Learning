package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();

        for (int i = 0; i < 6; i++) {
           if (X % 2 == 0) {
               X += 1;
           }
           System.out.println(X);
           X += 2;
        }
    }
}
