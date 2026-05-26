package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N > 10000) {
            throw new ArithmeticException();
        }

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            int X = in.nextInt();
            if (X > 10000000) {
                throw new ArithmeticException();
            } else if (X < -10000000) {
                throw new ArithmeticException();
            }
            array[i] = X;
        }

        int out = 0;
        int inside = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 20) {
                inside++;
            } else {
                out++;
            }
        }
        System.out.println(inside + " in");
        System.out.println(out + " out");
    }
}
