import java.util.Scanner;
public class Project04_ProgramToCheckLeapYear {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program To Check Leap Year ===");
        System.out.printf("Enter year (AD): ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap year."); 
                } else {
                    System.out.println(year + " is not a Leap year."); 
                }
            } else {
                System.out.println(year + " is a Leap year.");
            }
        } else {
            System.out.println(year + " is not a Leap year.");
        }
        sc.close();
    }
}