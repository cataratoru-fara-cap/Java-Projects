import java.util.Scanner;

public class PositiveMessageSelector {

    // This is a private static method that takes an integer 'number' as input and returns a String message.
    private static String getPositiveMessage(int number) {
        String message; // Declare a variable 'message' of type String.
        switch (number) { // Use a switch statement to check the value of 'number'.
            case 1: // If 'number' is 1, execute the following block of code.
                message = "You're doing great!"; // Assign the message "You're doing great!" to 'message'.
                break; // Exit the switch statement.
            case 2: // If 'number' is 2, execute the following block of code.
                message = "Keep up the good work!"; // Assign the message "Keep up the good work!" to 'message'.
                break; // Exit the switch statement.
            case 3: // If 'number' is 3, execute the following block of code.
                message = "You're almost there!"; // Assign the message "You're almost there!" to 'message'.
                break; // Exit the switch statement.
            case 4: // If 'number' is 4, execute the following block of code.
                message = "You're almost halfway done!"; // Assign the message "You're almost halfway done!" to 'message'.
                break; // Exit the switch statement.
            case 5: // If 'number' is 5, execute the following block of code.
                message = "You've made it!"; // Assign the message "You've made it!" to 'message'.
                break; // Exit the switch statement.
            default: // If 'number' does not match any of the above cases, execute the following block of code.
                message = "Invalid number."; // Assign the message "Invalid number." to 'message'.
                break; // Exit the switch statement.
        }
        //if we wouldn t exit the switch statement using "break" once a case gets triggered,
        // all the statements below would also get triggered
        return message; // Return the value of 'message'.
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read input from the user.
        System.out.println("Enter a number between 1 to 5 for a Grande dose of positivity!: "); // Print a message to prompt the user for input.
        int number = scanner.nextInt(); // Read an integer input from the user and assign it to the variable 'number'.
        String message = getPositiveMessage(number); // Call the 'getPositiveMessage' method with 'number' as the argument and assign the returned message to the variable 'message'.
        System.out.println(message); // Print the value of 'message' to the console.
        scanner.close(); // Close the Scanner object to release system resources.
        //If we wouldn t close scanner we would get a "warning", similar to how you drain a bathtub after you re done using it,
        // we do the same in the case of objects like scanner, we "close" them to get rid of the "garbage"
    }
}