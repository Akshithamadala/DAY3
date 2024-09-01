import java.util.Arrays;

public class AnagramCheck {

    public static String areAnagrams(String str1, String str2) {
        // Normalize strings
        char[] chars1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] chars2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();

        // If lengths differ, they can't be anagrams
        if (chars1.length != chars2.length) return "no";

        // Sort and compare character arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2) ? "yes" : "no";
    }

    public static void main(String[] args) {
        System.out.println("Output: " + areAnagrams("learn", "simple"));
    }
}

