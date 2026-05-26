package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int sumCD = C + D;
        int sumAB = A + B;
        if (B > C && D > A && sumCD > sumAB && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
