package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N < 5 || N > 2000){
            throw new ArithmeticException();
        }

        for (int X = 2; X <= N; X += 2) {

            System.out.println(X+"^2 = "+ String.format("%.0f", Math.pow(X, 2)));

        }
    }
}
