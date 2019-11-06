import java.io.Console;

/**
 * Exercise3
 */
public class Exercise3 {

    public static void main(String[] args) {        

        Console console = System.console();
        String word = console.readLine("Enter the word: ");
        System.out.println(isPalindrome(word));
        
    }

    public static boolean isPalindrome(String word) {
        
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}