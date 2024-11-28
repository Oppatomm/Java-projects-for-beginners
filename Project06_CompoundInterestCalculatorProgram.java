import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Project06_CompoundInterestCalculatorProgram {
    public static void main (String[]args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter principal amount: ");
            BigDecimal principal_amount = sc.nextBigDecimal();
            System.out.print("Enter annual interest rate (in %): ");
            BigDecimal annual_interest = sc.nextBigDecimal();
            System.out.print("Enter time (in years): ");
            int year = sc.nextInt();
            BigDecimal Denominator = new BigDecimal("100");
            for (int i = 1; i <= year; i++) {
                BigDecimal result = principal_amount.multiply(annual_interest.divide(Denominator));
                principal_amount = principal_amount.add(result);
            }
            System.out.println(principal_amount.setScale(2,RoundingMode.HALF_UP));
        }
    }
}