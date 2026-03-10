package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1011 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double volume = (4.0 / 3.0) *  3.14159 * Math.pow(raio, 3);

        System.out.println("VOLUME = " + String.format("%.3f", volume));
    }

}
