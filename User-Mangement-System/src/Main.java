import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String[] usernames = new String[100];
        int[] passwords = new int[100];
        String username;
        int password;
        int i = 0;
        do {
            System.out.println("Welcome to user management System :");
            System.out.println("1.Register\n2.Login\n3.Exit");
            System.out.print("Select an option :");
            option = input.nextInt();
            input.nextLine();//left over new line
            switch (option) {
                case 1:
                    System.out.println("Enter username : ");
                    String a = input.nextLine().trim();
                    usernames[i] = a;

                    System.out.println("Enter Password  : ");
                    int b = input.nextInt();
                    input.nextLine();

                    passwords[i] = b;
                    System.out.println("Registration Successful!");
                    i++;
                    break;
                case 2:
                    System.out.print("Enter username : ");
                    username = input.nextLine().trim();
                    System.out.println("Enter Password : ");
                    password = input.nextInt();
                    input.nextLine();
                    boolean loginSuccess = false;
                    for (int j = 0; j < i; j++) {
                        if (username.equals(usernames[j]) && password == passwords[j]) {
                            System.out.println("Login Successful! Welcome " + username);
                            loginSuccess = true;
                            break;
                        }
                    }
                    if(!loginSuccess){
                        System.out.println("Invalid username and password ");
                    }


            }


        } while (option != 3);

        System.out.println("Exiting Program.......");
    }
}