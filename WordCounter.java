import java.util.Scanner;

public class WordCounter {
    
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        
        System.out.println("The sentence has " + countWords(sentence) + " words.");
        
        scanner.close();
    }
}
