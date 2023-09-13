import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({}[}])[]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!characterStack.isEmpty()) {
                if (characterStack.peek() == '(' && s.charAt(i) == ')') characterStack.pop();
                else if (characterStack.peek() == '{' && s.charAt(i) == '}') characterStack.pop();
                else if (characterStack.peek() == '[' && s.charAt(i) == ']') characterStack.pop();
                else characterStack.push(s.charAt(i));
            } else characterStack.push(s.charAt(i));
        }
        return characterStack.isEmpty();
    }
}
