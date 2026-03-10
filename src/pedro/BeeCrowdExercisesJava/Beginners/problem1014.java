package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilometers;
        double spentFuel;

        kilometers = input.nextInt();
        spentFuel = input.nextDouble();

        System.out.println(String.format("%.3f", kilometers / spentFuel) + " km/l");

    }
}
