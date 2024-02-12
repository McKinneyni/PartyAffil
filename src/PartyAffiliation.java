import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        // Step 2: Prompt the user to choose their party affiliation
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        // Step 3: Read the user's choice
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next().toUpperCase();

        // Step 4: Use cascaded if structure to respond accordingly
        if (choice.equals("D")) {
            // If choice is D (Democrat)
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            // If choice is R (Republican)
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            // If choice is I (Independent)
            System.out.println("You get an Independent Person.");
        } else {
            // If choice is anything else
            System.out.println("You get Other.");
        }

        // Step 5: Close the scanner
        scanner.close();
    }
}
