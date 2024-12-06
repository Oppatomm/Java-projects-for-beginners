import java.util.Scanner;
public class Project02_TemperatureConversionProgram_CtoF_FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Temperature Conversion Program Celsius to Fahrenheit , Fahrenheit to Celsius ===");
        System.out.printf("Enter temperature: ");
        int temperature = sc.nextInt();
        sc.nextLine();
        System.out.printf("Convert to (C/F): ");
        String choose = sc.nextLine();
        switch (choose) {
            case "F" : 
                int Fahrenheit = (temperature * 9/5) + 32;
                System.out.println("Result: " + Fahrenheit + " \u00B0F");
                break;
            case "C" :
                int Celsius = (temperature - 32) * 5/9;
                System.out.println("Result: " + Celsius + "\u00B0C");
                break;
        }
        sc.close();
    }
}
