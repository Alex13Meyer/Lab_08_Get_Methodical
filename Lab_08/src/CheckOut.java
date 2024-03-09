import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     double totalCost = 0.0;

     do {
         double itemPrice = SafeInput.getRangedDouble(in, "Enter your item price ($0.50 to $10.00):", 0.50, 10.00);
         totalCost += itemPrice;
         char moreItems = SafeInput.getYNConfirm(in, "Do you have more items to purchase? (y/n)");
// Prompts the user to enter price and whether they have more items to enter
         if (moreItems == 'n') {
             break;
         }
     } while (true);
     System.out.printf("Total cost of the item(s): $%.2f\n", totalCost);
     in.close();
    }
}
