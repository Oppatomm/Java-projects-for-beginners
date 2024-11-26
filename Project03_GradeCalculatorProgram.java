import java.util.Scanner;
public class Project03_GradeCalculatorProgram {
    public static void main (String[]args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.printf("Enter score: ");
        int score = sc.nextInt();
        if (score <= 100 && score >= 80) {
            System.out.println("A");
        }else if (score <= 79 && score >= 70) {
            System.out.println("B");
        }else if (score <= 69 && score >= 60) {
            System.out.println("C");
        }else if (score <= 59 && score >= 50) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
    }
}