import java.io.Console;

/**
 * Exercise2
 */
public class Exercise2 {

    public static void main(String[] args) {
        Console console = System.console();
        int year = Integer.parseInt(console.readLine("Enter a Year: "));
        int century = year / 100;

        if(year % 100 != 0) {
            century++;
        }

        System.out.println("Century is: " + century);
    }
}