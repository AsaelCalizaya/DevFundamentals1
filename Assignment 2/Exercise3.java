/**
 * Exercise3
 */
public class Exercise3 {

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "O ll e H E";

        System.out.println(isWordAnagram(word1, word2));
    }

    public static boolean isWordAnagram(String word1, String word2) {
        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                if (!word2.contains(String.valueOf(word1.charAt(i)))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}