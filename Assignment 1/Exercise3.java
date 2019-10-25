import java.io.Console;

/**
 * Exercise3
 */
public class Exercise3 {

    private static int start;
    private static int end;

    public static void main(String[] args) {
        

        Console console = System.console();
        String word = console.readLine("Enter the word: ");
        System.out.println(isPalindrome(word));
        
    }

    public static boolean isPalindrome(String word) {
        
        start = 0;
        end = word.length() - 1;

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