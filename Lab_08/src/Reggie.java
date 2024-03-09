import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "What is your SSN (e.g., 123-45-6789):", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentID = SafeInput.getRegExString(in, "Enter your UC student ID (e.g., M12345):", "^(M|m)\\d{5}$");
        char menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O: Open, S: Save, V: View, Q: Quit):", "[OoSsVvQq]$").charAt(0);
        // Prompts user to enter SSN StudentID and menuChoice
    in.close();
    }
}
