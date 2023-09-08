public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("abcba"));
    }

    private static boolean isValidPalindrome(String s) {
        String sr = "";
        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        sr = new StringBuilder(s).reverse().toString();
        return sr.equals(s);
    }
}
