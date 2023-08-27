package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {

    public static int longestPalindrome(String s) {
        Map<String, Integer> charsCounters = new HashMap<>();
        boolean oddAdded = false;
        int longestPalindrome = 0;

        if (s.length() == 1)
            return 1;

        for (int i = 0; i < s.length(); i++) {
            charsCounters.put(s.substring(i, i + 1), charsCounters.getOrDefault(s.substring(i, i + 1), 0) + 1);
        }

        if (charsCounters.size() == 1)
            return s.length();

        for (Map.Entry<String, Integer> entry : charsCounters.entrySet()) {
            if (entry.getValue() % 2 != 0 && entry.getValue() != 1) {
                if (!oddAdded) {
                    longestPalindrome += entry.getValue();
                    oddAdded = true;
                }
                else {
                    longestPalindrome += entry.getValue() - 1;
                }
            }

            if (entry.getValue() % 2 == 0)
                longestPalindrome += entry.getValue();

            else {
                if (!oddAdded) {
                    longestPalindrome++;
                    oddAdded = true;
                }
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); // 7
        System.out.println(longestPalindrome("ccccdd")); // 6
        System.out.println(longestPalindrome("a")); // 1
        System.out.println(longestPalindrome("ccc")); // 3
        System.out.println(longestPalindrome("bananas")); // 5
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
        // 983

    }
}
