package leetcode;

public class ReverseString344 {

    public static void reverseString(char[] s) {
        StringBuffer reversedString = new StringBuffer(String.copyValueOf(s));

        reversedString.reverse();
        reversedString.getChars(0, reversedString.length(), s, 0);
        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'h','a','n','n','a', 'h'});
    }
}
