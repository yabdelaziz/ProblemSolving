package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charKeyMap = new HashMap<>();
        Map<Character, Character> charValueMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charKeyMap.putIfAbsent(s.charAt(i), t.charAt(i));
            charValueMap.putIfAbsent(t.charAt(i), s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (charKeyMap.get(s.charAt(i)) != t.charAt(i))
                return false;

            if (charValueMap.get(t.charAt(i)) != s.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}

