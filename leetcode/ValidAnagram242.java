package leetcode;

import java.util.Arrays;

public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] sortedFirstString = s.toCharArray();
        char[] sortedSecondString = t.toCharArray();

        Arrays.sort(sortedFirstString);
        Arrays.sort(sortedSecondString);

        s = new String(sortedFirstString);
        t = new String(sortedSecondString);

        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cba", "abc"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("cara", "car"));
    }
}
