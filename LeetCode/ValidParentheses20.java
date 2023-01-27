package LeetCode;

import java.util.Stack;

public class ValidParentheses20 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray.length % 2 != 0) {
                return false;
            }

            else if (stack.size() == 0 && (charArray[0] == ')' || charArray[0] == ']' || charArray[0] == '}'))
                return false;

            else if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                stack.push(charArray[i]);
            }

            else if (stack.size() != 0 && (charArray[i] == ')' || charArray[i] == ']' || charArray[i] == '}')) {
                Character character = stack.pop();
                if (character == '(' && charArray[i] == ')' || character == '[' && charArray[i] == ']' || character == '{' && charArray[i] == '}') {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String s = "(){}}{";
        String s1 = "((";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "()))";

        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }
}
