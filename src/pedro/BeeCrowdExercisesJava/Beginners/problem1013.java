package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1013 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int maiorAB = (a+b+Math.abs(a-b)) / 2;
        maiorAB = Math.max(maiorAB, c);

        System.out.println(maiorAB +" eh o maior");
    }
}
