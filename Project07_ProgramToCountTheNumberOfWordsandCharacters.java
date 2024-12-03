import java.util.Scanner;
public class Project07_ProgramToCountTheNumberOfWordsandCharacters {
    
    public static int  countwords (String sentence) {
        String [] words = sentence.split("\\s+");
        int wordcount = words.length;
        return wordcount;
    }
    public static int countcharacter (int charcount , String sentence) {
        charcount = sentence.replace(" ", "").length();
        return charcount;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter a sentence : ");
            String sentence  = scanner.nextLine();
            System.out.println("Words : " + countwords(sentence));
            System.out.println("Characters : " + countcharacter(0, sentence));
        }
    }
}
