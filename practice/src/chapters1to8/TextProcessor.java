package chapters1to8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love to eat brownies");
        reverseString("Hello there stranger!");
        addSpaces("HiIt'sMeYannelly");
    }

    /**
     * splits a string into an array by tokenizing it.
     * Counts word and prints them
     *
     * @param text full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }

    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        var modified = new StringBuilder(text);
        for (int i = 0; i < modified.length(); i++) {
            if (i != 0 && Character.isUpperCase(modified.charAt(i))) {
                modified.insert(i, " ");
                i++;
            }
        }
        System.out.println(modified);
    }
}
