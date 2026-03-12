package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(); // 7 // 9
        double b = input.nextDouble(); // 8 // 8
        double c = input.nextDouble(); // 9 // 7
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException();
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (a == b && b == c && c == a) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b && b == c && c != a) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
