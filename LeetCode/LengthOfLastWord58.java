package LeetCode;

public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int lastIndexOfSpace = s.lastIndexOf(" ");

        if (s.length() == 1)
            return 1;

        else if (s.length() == 0)
            return 0;

        return s.length()-1 - lastIndexOfSpace;

    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("    day"));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(" ");
//        System.out.println();
    }
}
