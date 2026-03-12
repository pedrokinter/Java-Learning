package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] array = new String [] {"Brasilia",  "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora",
                "Campinas", "Vitoria", "Belo Horizonte"};

        int [] ddd = new int []{61, 71, 11, 21, 32, 19, 27, 31};

        int N = input.nextInt();
        for (int i = 0; i < ddd.length; i++) {
            if (ddd[i] == N) {
                System.out.println(array[i]);
                break;
            }
            if (i == ddd.length - 1 && N != ddd[i]) {
                System.out.println("DDD nao cadastrado");
            }
        }
    }
}
