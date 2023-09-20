import java.util.Objects;
import java.util.Stack;

public class EvalRPN {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> integerStack = new Stack<>();
        for (String token : tokens) {
            if (Objects.equals(token, "+")) {
                integerStack.add(integerStack.pop() + integerStack.pop());
            } else if (Objects.equals(token, "-")) {
                int a = integerStack.pop();
                int b = integerStack.pop();
                integerStack.add(b - a);
            } else if (Objects.equals(token, "*")) {
                integerStack.add(integerStack.pop() * integerStack.pop());
            } else if (Objects.equals(token, "/")) {
                int a = integerStack.pop();
                int b = integerStack.pop();
                integerStack.add(b / a);
            } else {
                integerStack.add(Integer.parseInt(token));
            }
         }
        return integerStack.pop();
    }
}
