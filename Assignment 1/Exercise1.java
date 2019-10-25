import java.io.Console;

/**
 * Exercise 1
 */
public class Exercise1 {

    public static void main(String[] args) {
        Console console = System.console();
        int number = Integer.parseInt(console.readLine("Enter number: "));
        int result = (int) (Math.pow(10, number)-1);
        System.out.println(result);
    }
    
}