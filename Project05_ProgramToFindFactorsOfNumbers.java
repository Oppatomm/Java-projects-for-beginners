import java.util.Scanner;
public class Project05_ProgramToFindFactorsOfNumbers {
    public static void main (String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Program To Find Factors of Numbers ===");
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (number == i) {
                        System.out.print(i);
                    }else {
                        System.out.print(i + ", ");
                    }
                }
        }
    }
}
}