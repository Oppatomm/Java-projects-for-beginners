import java.util.Scanner;
public class Project04_ProgramToCheckLeapYear {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter year (AD): ");
        int year = sc.nextInt();
        if (year % 4 != 0) {
            System.out.println("Year");
        }else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("2Year");
        }else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("3Year");
        }else if (year % 400 == 0 && year % 100 == 0) {
            System.out.println(year + " is a Leap year.");
        }
        sc.close();
    }
}