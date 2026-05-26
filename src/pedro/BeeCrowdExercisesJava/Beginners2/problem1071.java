package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;

        if (A > B) {
            for (int i = B; i < A; i++) {
                B++;
                if (B % 2 == 0){
                    sum += 0;
                } else {
                    sum += B;
                }

                if (B == A - 1){
                    break;
                }
            }
        }


        System.out.println(sum);
    }
}
