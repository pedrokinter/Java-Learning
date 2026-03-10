package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double triangleArea = (A*C) / 2;
        double circleArea = 3.14159 * Math.pow(C, 2);
        double trapeziumArea = (A+B) * C / 2;
        double squareArea = Math.pow(B, 2);
        double rectangleArea = A*B;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangleArea)
        + "\nCIRCULO: " + String.format("%.3f", circleArea)
                + "\nTRAPEZIO: " + String.format("%.3f", trapeziumArea
        ) + "\nQUADRADO: " + String.format("%.3f", squareArea) + "\nRETANGULO: " + String.format("%.3f", rectangleArea));
    }
}
