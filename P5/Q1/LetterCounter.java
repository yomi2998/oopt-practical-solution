package P5.Q1;

public class LetterCounter {
    public static int countLetter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ch) {
                ++count;
            }
        }
        return count;
    }
}
