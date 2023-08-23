package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {

    public static boolean wordPattern(String pattern, String s) {


        Map<String, String> patternMapper = new HashMap<>();

        String[] splittedString = s.split(" ");

        if (pattern.length() != splittedString.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            patternMapper.putIfAbsent(pattern.substring(i, i + 1), splittedString[i]);
        }


        int initialCount = patternMapper.size();

        long distinctCount = patternMapper.values().stream().distinct().count();

        if (distinctCount != initialCount)
            return false;

        for (int j = 0; j < splittedString.length; j++) {

            if (!patternMapper.get(pattern.substring(j, j + 1)).equals(splittedString[j]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("a", "dog"));
        System.out.println(wordPattern("abba", "dog cat cat dog dog"));
        System.out.println(wordPattern("abbaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));

    }
}