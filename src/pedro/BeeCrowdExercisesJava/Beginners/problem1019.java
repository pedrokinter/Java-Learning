package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();


        int hours = inputNum / 3600;
        int minutes = ( inputNum % 3600 )/ 60;
        int seconds = inputNum % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
