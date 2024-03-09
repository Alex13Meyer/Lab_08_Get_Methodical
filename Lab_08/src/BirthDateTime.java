import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "What was your birth year (1950-2015)?", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "What was your birth month (1-12)?", 1, 12);
        int maxDays;
        switch (birthMonth) {
            // Creates a specified range of days for each month
            case 2: maxDays = 29;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
            break;
            default:
                maxDays = 31;
            break;
        }
        int birthDay = SafeInput.getRangedInt(in, "Enter the day of birth (1-" + maxDays + "):", 1, maxDays);
        int birthHour = SafeInput.getRangedInt(in, "Enter the hour of birth (1-24):", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter the minute of birth (1-59):", 1, 59);
// Prompts user to enter a number in the specified ranges
        System.out.println("Your birth details: ");
        System.out.println("Year: " + birthYear);
        System.out.println("Month: " + birthMonth);
        System.out.println("Day: " + birthDay);
        System.out.println("Hour: " + birthHour);
        System.out.println("Minute: " + birthMinute);

        in.close();
    }
}
