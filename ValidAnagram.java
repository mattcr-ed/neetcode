import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("anagram", "anargam"));
    }

    //Take in two strings and split into chars
    //Sort chars and compare the two strings
    //Anagrams will have the same sorted string, return true if matching, false if not
    public static boolean isValidAnagram(String str1, String str2) {
        str1 = sorted(str1);
        str2 = sorted(str2);

        return str1.equals(str2);
    }

    public static String sorted(String text) {
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
