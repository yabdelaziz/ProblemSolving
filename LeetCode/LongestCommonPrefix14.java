package LeetCode;

public class LongestCommonPrefix14 {

    static String longestCommonPrefix(String[] strs) {

        int index = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i)) {
                index++;
            } else {
                break;
            }

        }

        return index == 0 ? "" : strs[0].substring(0, index);
    }

    public static void main(String[] args) {

        String strs[] = {"dog","racecar","car"};

        String strs2[] = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));


    }
}

