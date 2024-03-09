import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favoriteInt);
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double:");
        System.out.println("Your favorite double is: " + favoriteDouble);
// Prompts user to enter their favorite integer and double and returns these with included print
        in.close();
    }
}