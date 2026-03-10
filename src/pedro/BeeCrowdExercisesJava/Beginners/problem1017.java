package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int spentTimeInTrip = input.nextInt();
        int averageSpeedKm = input.nextInt();
        double averageSpeedTotal = averageSpeedKm * spentTimeInTrip;
        System.out.printf("%.3f%n",averageSpeedTotal / 12);
    }
}
