public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(({asdasdasda{})}))"));
    }

    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        int oCurl = 0, cCurl = 0, oBrac = 0, cBrac = 0;
        for (char c : charArray) {
            switch (c) {
                case '{' -> oCurl += 1;
                case '(' -> oBrac += 1;
                case '}' -> cCurl += 1;
                case ')' -> cBrac += 1;
            }
        }

        return (oCurl == cCurl && oBrac == cBrac);
    }
}
