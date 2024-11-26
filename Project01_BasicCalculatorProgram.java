import java.util.Scanner;
class Project01_BasicCalculatorProgram {
    public static void main (String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("== Basic calculator ===");
        System.out.printf("Enter first number : ");
        int first = sc.nextInt();
        System.out.printf("Enter second number : ");
        int second = sc.nextInt();
        sc.nextLine();
        System.out.printf("Choose operation (+, -, *, /) : ");
        String value = sc.nextLine();

        switch (value) {
            case "+" :
                System.out.println("Result : " + (first + second));
                break;
            case "-" :
                System.out.println("Result : " + (first - second));
                break;
            case "*" :
                System.out.println("Result : " + (first * second));
                break;
            case "/" :
                if (second != 0) {
                    System.out.println("Result : " + (first / second));
                }else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default :
                System.out.println("Invalid operation. Please enter +, -, *, or /.");
        }
        sc.close();
    }
}