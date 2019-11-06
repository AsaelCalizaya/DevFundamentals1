import java.util.LinkedHashMap;

/**
 * Exercise2
 */
public class Exercise2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        String words = "This is is a new text text that have repeating repeating repeating words";
        String[] splitedWords = words.split("\\s");

        for (String word1 : splitedWords) {
            int repeated = 0;
            String value;
            value = word1;
            for (String word2 : splitedWords) {
                if (value.equals(word2)) {
                    repeated++;
                }
            }
            result.put(word1, repeated);
        }

        result.keySet().forEach(key -> {
            if (result.get(key) > 1) {
                System.out.println(key + ": " + result.get(key));
            }
        });
    }
}