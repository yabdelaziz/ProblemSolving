package LeetCode;

public class LongestCommonPrefix14 {

    static int getSmallestStringLength(String[] strs) {

        int index = 0;

        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[index].length() <= strs[i + 1].length()) {
                continue;
            } else {
                index = i + 1;
            }
        }

        return index;
    }

    static String longestCommonPrefix(String[] strs) {

        String prefix = "";
        int smallestStringLength = getSmallestStringLength(strs);

        for (int i = 0; i < strs[smallestStringLength].length(); i++) {
            for (String str : strs) {

                if (strs[smallestStringLength].charAt(i) == str.charAt(i)) {
                    continue;
                } else {
                    return prefix;
                }
            }
            prefix += strs[smallestStringLength].charAt(i);

        }

        return strs.length == 1 ? strs[0] : prefix;

    }

    public static void main(String[] args) {

        String[] strs = {"ab"};

        String[] strs2 = {"flower", "flow", "reflight"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));


    }
}

