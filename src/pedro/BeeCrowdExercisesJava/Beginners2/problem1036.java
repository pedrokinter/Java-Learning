package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double bhaskaraX2 = (-b - (Math.sqrt(delta))) / (2 * a);
        double bhaskaraX1 = (-b + (Math.sqrt(delta))) / (2 * a);

        if (delta < 0 || a == 0 || b == 0 || c == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + String.format("%.5f", bhaskaraX1));
            System.out.println("R2 = " + String.format("%.5f", bhaskaraX2));
        }
    }
}
