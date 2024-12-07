import java.util.Scanner;
import java.util.Random;
public class Project08_NumberGuessingGame {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random(); 
            int num = random.nextInt(100);
            int count = 0;
            int guessnumber;
            System.out.println("=== Number Guessing Game ===");
            do {
                System.out.printf("Guess the number (1-100) : ");
                guessnumber = scanner.nextInt();

                count += 1;
                if (guessnumber > num) {
                    System.out.println("Too high! ");
                    continue;
                }else if (guessnumber < num) {
                    System.out.println("Too low! ");
                    continue;
                }else {
                    System.out.println("Correct! You ");
                    System.out.printf("guessed it in %d tries." , count);
                    break;
                }
            }while (guessnumber >= 0 );

        }
    }
}


