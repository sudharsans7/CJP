import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String str1 = "((({})))";
        String str2 = "(){}[]";
        String str3 = "({[})";

        System.out.println(str1 + " is valid: " + isValidParentheses(str1));
        System.out.println(str2 + " is valid: " + isValidParentheses(str2));
        System.out.println(str3 + " is valid: " + isValidParentheses(str3));
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
