package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int note = input.nextInt();
        if (note < 0 || note > 1000000) {
            throw new ArithmeticException("Invalid input");
        }

        int bankNote100 = note / 100;
        int bankNote50  = note / 500 ;
        int bankNote20 = note / 20;
        int bankNote10 = note / 10;
        int bankNote5 = note / 5;
        int bankNote2 = note / 2;


        System.out.println(bankNote100);
        System.out.println(bankNote50);
        System.out.println(bankNote20);
        System.out.println(bankNote10);
        System.out.println(bankNote5);
        System.out.println(bankNote2);
    }
}
