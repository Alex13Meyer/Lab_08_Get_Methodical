import java.util.Scanner;
public class getUserName {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String firstName ="";
        String lastName ="";
        // Get first name
        do {
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            if (!isValidName(firstName)){
                System.out.println("Invalid name. Try again.");
            }
        } while (!isValidName(firstName));

        // Get last name
        do {
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        if (!isValidName(lastName)) {
            System.out.println("Invalid name. Try again.");
        }
        } while (!isValidName(lastName));

        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
    // Check to see if the Name is a valid name
    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }
}
