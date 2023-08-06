package LeetCode;

import java.util.*;

public class FirstUniqueCharacterInAString387 {

    public static int firstUniqChar(String s) {

        Map<String, List<Integer>> charCounterMap = new LinkedHashMap<>();
        List<Integer> charOccurenceIndexes;

        for (int i = 0; i < s.length(); i++) {

            if (charCounterMap.containsKey(s.substring(i, i+1))) {
                charOccurenceIndexes = charCounterMap.get(s.substring(i, i + 1));
                charOccurenceIndexes.add(i);

            }
            else {
                charOccurenceIndexes = new ArrayList<>();
                charOccurenceIndexes.add(i);
                charCounterMap.put(s.substring(i, i + 1), charOccurenceIndexes);
            }
        }

        for (Map.Entry<String, List<Integer>> map: charCounterMap.entrySet()) {
            if (map.getValue().size() == 1)
                return map.getValue().get(0);

                continue;

        }

        return -1;
    }

    public static void main(String[] args) {


        System.out.println(firstUniqChar("leetcode")); // 0
        System.out.println(firstUniqChar("loveleetcode")); // 2
        System.out.println(firstUniqChar("aabb")); // -1
        System.out.println(firstUniqChar("party")); // 0
        System.out.println(firstUniqChar("s")); // 0
        System.out.println(firstUniqChar("ss")); // -1
        System.out.println(firstUniqChar("sss")); // -1
        System.out.println(firstUniqChar("ab")); // 0
        System.out.println(firstUniqChar("abc")); // 0
        System.out.println(firstUniqChar("aaabbbcccdddeeefffggghhhi")); // 24
    }
}
