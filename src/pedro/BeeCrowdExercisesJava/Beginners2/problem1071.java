package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;

        if (A > B) {
            B += 2;
             for (int i = B; i < A; i += 2){
                if (i % 2 == 1 || i < 0 ) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);
    }
}
