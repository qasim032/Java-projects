import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Number Guessing Game \n");

        System.out.print("Guess a number b/w 1-100 ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        Random randomNum = new Random();
        int ranNum = randomNum.nextInt(100); // Generates a number b/w 1-99
        int attempt;
        for (attempt = 1; num != ranNum; attempt++) {

            if (num > ranNum) {
                System.out.print("Please guess a small number ");
            } else {
                System.out.print(" Please guess a large number ");
            }
            num = input.nextInt();
        }
        System.out.println("The number is " + num);
        System.out.println("You guess the number in " + attempt + " attempts");

    }
}
