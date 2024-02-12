import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Step 2:  user to enter their age
        System.out.println("Welcome to the theater kiosk!");
        System.out.println("Please enter your age:");

        // Step 3: Read the user's age
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // Step 4: Check if the user is 21 or older
        if (age >= 21) {
            // If user is 21 or older, show message for getting a wristband
            System.out.println("You are 21 or older. You get a wristband!");
        }

        // Step 5: End
        scanner.close();
    }
}

