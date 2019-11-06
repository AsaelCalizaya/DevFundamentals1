/**
 * Exercise1
 */
public class Exercise1 {

    public static void main(String[] args) {
        int[] firstTestArrayOne = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Maximun value is: ".concat(String.valueOf(calculateMax(firstTestArrayOne))));
        System.out.println("Minimum value is: ".concat(String.valueOf(calculateMin(firstTestArrayOne))));
        System.out.println("Average value is: ".concat(String.valueOf(calculateAvg(firstTestArrayOne))));

    }

    public static int calculateMax(int[] numArray) {
        int max = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        return max;
    }

    public static int calculateMin(int[] numArray) {
        int min = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }
        return min;
    }

    public static float calculateAvg(int[] numArray) {
        int sum = 0;
        float avg = 0;

        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
            avg = (float) sum / (i + 1);
        }
        return avg;
    }
}