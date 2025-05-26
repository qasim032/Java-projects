import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("ROCK-PAPER-SCISSORS GAME");
        char cha = 'y';
        do {
            System.out.print("Enter your choice (rock,paper,scissors) : ");
            String userinput = input.nextLine().toLowerCase();
            if (!userinput.equals("rock") && !userinput.equals("paper") && !userinput.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }

            String com = choices[random.nextInt(3)];
            System.out.println("Computer choice : " + com);
            if (userinput.equals(com))
                System.out.println("It's a tie.");
            else if ((userinput.equals("rock") && com.equals("scissors"))|| (userinput.equals("paper")&& com.equals("rock")) || (userinput.equals("scissors")&& com.equals("paper")))
                System.out.println("You Win!");
            else
                System.out.println("You lose!");

            System.out.println("Did you want to play again(y/n) : ");
            cha = input.next().toLowerCase().charAt(0);
            input.nextLine();
        } while (cha == 'y');
        System.out.println("Exiting program...\nGood Bye!");
    }
}